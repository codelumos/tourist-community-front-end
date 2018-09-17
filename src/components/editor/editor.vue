<template>
  <div class="tmpl">

    <!--S: 顶部导航栏组件-->
    <headNav></headNav>
    <!--E: 顶部导航栏组件-->

    <div class='tinymce'>
      <h1>Blog:{{manuscript.title}}</h1>
      <br>
      <Input placeholder="请输入标题" v-model="manuscript.title" style="width: 100%"/>
      <br><br>
      <Row class="account-group">
        <Col span="1">
        <label>时间：</label>
        </Col>
        <Col span="4">
        <Input type="date" placeholder="时间" v-model="manuscript.time"/>
        </Col>
        <Col span="1" offset="3">
        <label>地点：</label>
        </Col>
        <Col span="2">
        <Input placeholder="大地点" />
        </Col>
        <Col span="2" offset="1">
        <Input placeholder="小地点" />
        </Col>
        <Col span="1" offset="1">
        <label>景点：</label>
        </Col>
        <Col span="2">
        <Input placeholder="景点" />
        </Col>
      </Row>


      <editor id='tinymce' v-model='manuscript.content' :init='init'></editor>
      <br>
      <Button class="button" :size="buttonSize" type="primary" @click="flag = true">发表</Button>
      <Button class="button" :size="buttonSize" type="success" @click="saveBlog()">保存</Button>
      <Button class="button" :size="buttonSize" type="default" @click="cancelBlog()">
        返回
      </Button>
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

  // 富文本编辑器 tinymce
  import tinymce from 'tinymce/tinymce'
  import editor from '@tinymce/tinymce-vue';
  import 'tinymce/themes/modern/theme'
  import 'tinymce/plugins/image'
  import 'tinymce/plugins/link'
  import 'tinymce/plugins/code'
  import 'tinymce/plugins/table'
  import 'tinymce/plugins/lists'
  import 'tinymce/plugins/contextmenu'
  import 'tinymce/plugins/wordcount'
  import 'tinymce/plugins/colorpicker'
  import 'tinymce/plugins/textcolor'

  import {mapMutations} from 'vuex';
  import {INITBLOG, CANCELBLOG} from "@/store/mutations/mutation-types";

  export default {
    name: 'tinymce',
    data() {
      return {
        init: {
          language_url: '/static/components/tinymce/zh_CN.js',
          language: 'zh_CN',
          skin_url: '/static/components/tinymce/skins/lightgray',
          height: 400,
          plugins: 'link lists image code table colorpicker textcolor wordcount contextmenu',
          toolbar:
            'bold italic underline strikethrough | fontsizeselect | forecolor backcolor | alignleft aligncenter alignright alignjustify | bullist numlist | outdent indent blockquote | undo redo | link unlink image code | removeformat',
          branding: false
        },
        buttonSize: 'large',
        address: [],
        manuscript: {
          title: '',
          time: '',
          place: [],
          content: ''
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
        this.$store.commit(INITBLOG, this.manuscript);
        this.$store.commit(CANCELBLOG);
        this.$Message.success({
          content: "发表成功！",
          duration: 5
        });
        this.$router.push({path: '/account'})

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
    },
    created() {
      this.initBlog();
    },
    mounted() {
      tinymce.init({})
    },
    components: {
      headNav,
      footNav,
      editor,
      backTop
    }
  }
</script>

<style scoped>
  .tmpl {
    width: 100%;
    overflow: hidden;
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

</style>
