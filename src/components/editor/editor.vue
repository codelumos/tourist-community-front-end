<template>
  <div class="tmpl">

    <!--S: 顶部导航栏组件-->
    <headNav></headNav>
    <!--E: 顶部导航栏组件-->

    <div class='tinymce'>
      <div class="desc">
        <h1>用你的经历与见识，给万千人带来新的旅游灵感</h1>
        <p>记录你旅游的点点滴滴</p>
      </div>
      <br/><br/><br/>
      <Row class="account-group">
        <label>日志标题：</label>
        <Input placeholder="请输入标题" v-model="manuscript.title" style="width: 100%"/>
      </Row>
      <Row class="account-group">
        <Col span="1">
          <label>日期：</label>
        </Col>
        <Col span="4">
          <Input type="date" placeholder="时间" v-model="manuscript.time"/>
        </Col>
        <Col span="2" offset="1">
          <label>位置： 省：</label>
        </Col>
        <Col span="2">
          <AutoComplete
            v-model="manuscript.lp"
            :data="address.lpArr"
            @on-search="searchLp"
            placeholder="省份"></AutoComplete>
        </Col>
        <Col span="1" offset="1">
          <label>市：</label>
        </Col>
        <Col span="2">
          <AutoComplete
            v-model="manuscript.sp"
            :data="address.spArr"
            @on-search="searchSp"
            placeholder="市（区）"></AutoComplete>
        </Col>
        <Col span="1" offset="1">
          <label>景点：</label>
        </Col>
        <Col span="4">
          <AutoComplete
            v-model="manuscript.spotName"
            :data="address.spotArr"
            @on-search="searchSpot"
            placeholder="景点"></AutoComplete>
        </Col>
      </Row>
      <Row class="account-group">
        <Col span="2">
        <label>封面图：</label>
        </Col>
        <Col span="2">
          <upload :initImage="manuscript.coverPath" @getImage="getImage"></upload>
        </Col>
      </Row>

      <editor id='tinymce' v-model='manuscript.contentEx' :init='init'></editor>
      <br/>
      <Button class="button" :size="buttonSize" type="primary" @click="flag = true">发表</Button>
      <Button class="button" :size="buttonSize" type="success" @click="saveBlog()">保存</Button>
      <Button class="button" :size="buttonSize" type="default" @click="cancelBlog()">返回</Button>
    </div>

    <!--S：返回顶部-->
    <backTop></backTop>
    <!--E:返回顶部-->

    <!--S：页脚部分-->
    <footNav></footNav>
    <!--E：页脚部分-->

    <Modal
      v-model="flag"
      title="通知"
      @on-ok="ok"
      :styles="{top: '20px'}"
      draggable>
      <p style="font-size: 15px;text-align: center">确定要发表吗?</p>
    </Modal>

  </div>
</template>

<script>
  import headNav from '../subcom/headNav-white.vue';
  import footNav from '../subcom/footNav';
  import backTop from '../subcom/backTop';
  import common from '../../common/common';
  import upload from '../account/subcom/upload';
  import axios from 'axios';

  // 富文本编辑器 tinymce
  import tinymce from 'tinymce/tinymce'
  import editor from '@tinymce/tinymce-vue';
  import 'tinymce/themes/modern/theme'
  import 'tinymce/plugins/autoresize'
  import 'tinymce/plugins/image'
  import 'tinymce/plugins/imagetools'
  import 'tinymce/plugins/link'
  import 'tinymce/plugins/code'
  import 'tinymce/plugins/table'
  import 'tinymce/plugins/lists'
  import 'tinymce/plugins/contextmenu'
  import 'tinymce/plugins/wordcount'
  import 'tinymce/plugins/colorpicker'
  import 'tinymce/plugins/textcolor'
  import 'tinymce/plugins/paste'

  import {mapState, mapMutations} from 'vuex'
  import {INITBLOG, CANCELBLOG} from "@/store/mutations/mutation-types";

  export default {
    name: 'tinymce',
    data() {
      return {
        init: {
          language_url: '/static/components/tinymce/zh_CN.js',
          language: 'zh_CN',
          skin_url: '/static/components/tinymce/skins/lightgray',
          autoresize_min_height: 400,

          plugins: 'autoresize link lists image imagetools code table colorpicker textcolor wordcount contextmenu paste',
          toolbar:
            'bold italic underline strikethrough | fontsizeselect | forecolor backcolor | alignleft aligncenter alignright alignjustify | bullist numlist | outdent indent blockquote | undo redo | link unlink image code | removeformat',
          paste_data_images: true,
          branding: false,
          images_upload_handler: function (blobInfo, success, failure) {
            let formdata = new FormData()
            formdata.set('file', blobInfo.blob())
            axios.post('http://localhost:8088/travelbyex/v1/images', formdata).then(res => {
              success(res.data.message)
            }).catch(res => {
              failure('图片上传失败')
            })
          }
        },
        buttonSize: 'large',
        address: {
          lpArr: [],
          spArr: [],
          spotArr: []
        },
        manuscript: {
          articleId: 0,
          authorId: '',
          title: '',
          time: '',
          lp: '',
          sp: '',
          spotName: '',
          contentEx: '',
          coverPath: 'http://img1.lotour.net/Inspiration/2018/0802/20180802160830772838853_1920.jpg',
          likes: 0,
          readers: 0,
          tag1: '',
          tag2: '',
          tag3: ''
        },
        flag: false
      }
    },
    methods: {
      ...mapMutations([INITBLOG, CANCELBLOG]),
      initBlog() {
        if (this.$store.state.blog.blogInfo != null) {
          this.manuscript = Object.assign({}, this.$store.state.blog.blogInfo);
        }
      },
      ok() {
        this.publishBlog();
      },
      publishBlog() {
        // 往数据库中存入该博客
        var url = common.apidomain + "/articles";
        var that = this;
        this.manuscript.authorId = this.accountInfo.userId;

        this.$http.post(url, this.manuscript).then(function (response) {
          var data = response.data;
          if (data.status === 0) {
            that.$store.commit(INITBLOG, that.manuscript);
            that.$store.commit(CANCELBLOG);
            that.$Message.success({
              content: "发表成功！",
              duration: 5
            });
            that.$router.push({path: '/account'});
          } else {
            that.$Message.warning({
              content: data.message,
              duration: 5
            });
          }
        });
      },
      saveBlog() {
        this.$store.commit(INITBLOG, this.manuscript);
        this.$Message.success({
          content: "保存成功！",
          duration: 5
        });
      },
      cancelBlog() {
        this.$router.push({path: '/index'});
      },
      searchLp(value) {
        var url = common.apidomain + "/largePlacesByName?lpName=" + value;
        var that = this;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {
            that.address.lpArr = !value ? [] : data.message;
          }
        });

      },
      searchSp(value) {
        var url = common.apidomain + "/smallPlacesByLpNameAndSpName?lpName=" + this.manuscript.lp + "&spName=" + value;
        var that = this;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {
            that.address.spArr = !value ? [] : data.message;
          }
        });
      },
      searchSpot(value) {
        var url = common.apidomain + "/spotsBySpNameAndSpotName?spName=" + this.manuscript.sp + "&spotName=" + value;
        var that = this;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {
            that.address.spotArr = !value ? [] : data.message;
          }
        });
      },
      getImage(image){
        console.log(image)
        this.manuscript.coverPath = image;
      }
    },
    created() {
      this.initBlog();
    },
    mounted() {
      tinymce.init({})
    },
    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      })
    },
    components: {
      headNav,
      footNav,
      editor,
      backTop,
      upload
    }
  }
</script>

<style scoped>
  .tmpl {
    width: 100%;
    overflow: hidden;
    background-color: #f8f8f9;
  }

  .tinymce {
    width: 90%;
    margin: 100px auto;
  }

  .button {
    margin-right: 30px;
  }

  .account-group {
    margin-bottom: 20px;
  }

  .account-group label {
    font-size: 15px;
    line-height: 35px;
  }

  .desc {
    text-align: center;
    margin-top: 80px;
  }

  .desc > p {
    margin-top: 20px;
    font-size: 15px;
    color: rgba(0, 0, 0, 0.4);
  }

</style>
