<template>
  <div class="tmpl">
    <!--S: 顶部导航栏组件-->
    <headNav class="headNav"></headNav>
    <!--E: 顶部导航栏组件-->
    <div class="desc">
      <h1>跟随兴趣去旅行，全年随时出发</h1>
      <p>世界很大，给不安分的心一个躁动的理由</p>
    </div>
    <br>

    <Row>
      <router-view></router-view>
    </Row>


    <backTop></backTop>
    <!--S：页脚部分-->
    <footNav></footNav>
    <!--E：页脚部分-->
  </div>
</template>

<script>
  import headNav from '../subcom/headNav-white.vue';
  import footNav from '../subcom/footNav-white';
  import backTop from '../subcom/backTop';

  import test from './test';

  export default {
    name: "mate",
    data() {
      return {}
    },
    components: {
      headNav,
      footNav,
      backTop,
      test
    }
  }
</script>

<style scoped>
  .tmpl{
    background-color: #f8f8f9;
  }
  .headNav
  {
    position: fixed;
    z-index: 3;
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
