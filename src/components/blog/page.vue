<template>
  <div class="tmpl">

    <!--S: 顶部导航栏组件-->
    <headNav></headNav>
    <!--E: 顶部导航栏组件-->

    <!--S 大图组件-->
    <board v-if="blog.article" :blog="blog.article"></board>
    <!--E 大图组件-->

    <!--S: 主体部分-->
    <Row class="context">
      <Col span="4" offset="2">
        <user-desc v-if="authorId" :id="authorId"></user-desc>
      </Col>

      <Col span="13" offset="7">
        <blog :blog="blog.article"></blog>
      <!--<comment></comment>-->
      </Col>
    </Row>
    <!--E: 主体部分-->

    <!--S：返回顶部-->
    <backTop></backTop>
    <!--E:返回顶部-->

    <!--S：页脚部分-->
    <footNav></footNav>
    <!--E：页脚部分-->
  </div>
</template>

<script>
  // 导入 子组件
  import headNav from '../subcom/headNav-white.vue';
  import board from './subcom/board';
  import footNav from '../subcom/footNav';
  import userDesc from './subcom/userDesc';
  import blog from './subcom/blog';
  import backTop from '../subcom/backTop';
  import comment from '../subcom/comment';

  import common from '../../common/common';

  export default {
    name: 'index',
    data() {
      return {
        id: 0,
        authorId: '',
        blog: {}
      };
    },
    methods:{
      async initBlog(){
        var url = common.apidomain + "/articles?articleId=" + this.id;
        var that = this;
        await this.$http.get(url).then(function (response) {
          var data = response.data;
          if(data.status === 0){
            that.blog = data.message;
            that.authorId = that.blog.article.authorId;

          }
        });

      }
    },
    created(){
      this.id = this.$route.params.id;

      this.initBlog();

    },
    components: {
      headNav,
      footNav,
      board,
      userDesc,
      blog,
      backTop,
      comment
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .tmpl {
    width: 100%;
    overflow: hidden;
  }

</style>
