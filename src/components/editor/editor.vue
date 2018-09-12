<template>
  <div class="tmpl">

    <!--S: 顶部导航栏组件-->
    <headNav></headNav>
    <!--E: 顶部导航栏组件-->

    <div class='tinymce'>
      <h1>Blog</h1><br>
      <input id="title" placeholder="请输入标题" /><br><br>
      <Row class="account-group">
        <Col span="1">
        <label>时间：</label>
        </Col>
        <Col span="4">
        <Input type="date" placeholder="时间" />
        </Col>
        <Col span="1" offset="3">
        <label>地点：</label>
        </Col>
        <Col span="4">
        <Cascader :data="address" ></Cascader>
        </Col>
      </Row>


      <editor id='tinymce' v-model='tinymceHtml' :init='init'></editor>
      <br>
      <Button class="button" :size="buttonSize" type="primary">发表</Button>
      <Button class="button" :size="buttonSize" type="success">保存</Button>
      <Button class="button" :size="buttonSize" type="default"><router-link to="/index">返回</router-link></Button>
    </div>

    <!--S：返回顶部-->
    <backTop></backTop>
    <!--E:返回顶部-->

    <!--S：页脚部分-->
    <footNav></footNav>
    <!--E：页脚部分-->

  </div>
</template>

<script>
  import headNav from '../subcom/headNav-color.vue';
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

  export default {
    name: 'tinymce',
    data() {
      return {
        tinymceHtml: '',
        init: {
          language_url: '/static/components/tinymce/zh_CN.js',
          language: 'zh_CN',
          skin_url: '/static/components/tinymce/skins/lightgray',
          height: 400,
          plugins: 'autoresize link lists image code table colorpicker textcolor wordcount contextmenu',
          toolbar:
            'bold italic underline strikethrough | fontsizeselect | forecolor backcolor | alignleft aligncenter alignright alignjustify | bullist numlist | outdent indent blockquote | undo redo | link unlink image code | removeformat',
          branding: false
        },
        buttonSize: 'large',
        address: []
      }
    },
    methods:{
      initAddress(){
        var that = this;
        var url = '../../static/data/address.json';

        this.$http.get(url).then(function (response) {

          that.address = response.data;
        }).catch(function (error) {
          that.$Message.warning(error);
        });

      },
    },
    created(){
      this.initAddress();
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

  #title {
    width: 90%;
    font-size: 18px;
  }
  .button
  {
    margin-right: 30px;
  }
  .account-group
  {
    margin-bottom: 20px;
  }
  .account-group label
  {
    font-size: 15px;
    line-height: 35px;
  }

</style>
