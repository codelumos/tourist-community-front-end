<template>
  <div class="tmpl">

    <!--S: 顶部导航栏组件-->
    <headNav></headNav>
    <!--E: 顶部导航栏组件-->

    <!--S 大图组件-->
    <board></board>
    <!--E 大图组件-->

    <!--S: 主体部分-->
    <Row class="context">
      <Col span="4" offset="2">
       <user-desc></user-desc>
      </Col>

      <Col span="13" offset="7">
        <blog></blog>
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
  import board from './board';
  import footNav from '../subcom/footNav';
  import userDesc from './userDesc';
  import blog from './blog';
  import backTop from '../subcom/backTop';

  export default {
    name: 'index',
    data() {
      return {}
    },
    components: {
      headNav,
      footNav,
      board,
      userDesc,
      blog,
      backTop
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
