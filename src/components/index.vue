<template>
  <div class="tmpl">

    <!--S: 顶部导航栏组件-->
    <headNav></headNav>
    <!--E: 顶部导航栏组件-->

    <!--S 走马灯组件-->
    <carousel></carousel>
    <!--E 走马灯组件-->

    <!--S: 主体部分-->
    <div class="main-wrapper">
      <Row>
        <Col span="20" offset="2">
        <div class="desc">
          <h1>嗨！驴友旅游网欢迎您！</h1>
          <p>我们帮助您寻找志同道合的驴友，我们给予你们分享快乐的平台</p>

          <!--S: 搜索组件-->
          <searchInput></searchInput>
          <!--E: 搜索组件-->
        </div>

        <div class="card-group">
          <div class="card-desc">
            <h2>不要眨眼，还有N种好玩的兴趣主题，等你来探索</h2>
            <p>Recommended many kinds of tourism interests, just for you.</p>
          </div>

          <!--栅格居中布局-->
          <Row>
            <Col span="22" offset="2">
              <smallCards></smallCards>
            </Col>
          </Row>

        </div>

        <div class="card-group">
          <div class="card-desc">
            <h2>来自驴友和旅行社的热门分享，等你来发现</h2>
            <p>Popular sharing from friends and travel agencies, just for you.</p>
          </div>

          <!--栅格居中布局-->
          <Row>
            <Col span="22" offset="2">
            <normalCards></normalCards>

            </Col>
          </Row>
        </div>

        <div class="card-group">
          <Row>
            <Col span="22" offset="2">
            <bigCards></bigCards>
            </Col>
          </Row>
        </div>
        </Col>
      </Row>


    </div>
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
  import carousel from './subcom/carousel.vue';
  import headNav from './subcom/headNav.vue';
  import searchInput from './subcom/searchInput.vue';
  import smallCards from './subcom/smallCards.vue';
  import normalCards from './subcom/normalCards';
  import bigCards from './subcom/bigCards';
  import footNav from './subcom/footNav';
  import backTop from './subcom/backTop';


  export default {
    name: 'index',
    data() {
      return {}
    },
    components: {
      carousel,
      headNav,
      searchInput,
      smallCards,
      normalCards,
      footNav,
      bigCards,
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

  .main-wrapper {
    width: 100%;
  }

  .main-wrapper > div {

    margin: 0 auto;

  }

  .desc {
    text-align: center;
    margin-top: 30px;
  }

  .desc > p {
    margin-top: 20px;
    font-size: 15px;
    color: rgba(0, 0, 0, 0.4);
  }

  .card-group {
    width: 100%;
    margin-bottom: 30px;
  }

  .card-group h2 {
    font-size: 28px;
    text-align: center;
  }

  .card-desc
  {
    margin-bottom: 20px;
  }

  .card-desc > p {
    text-align: center;
    margin-top: 5px;
    font-size: 15px;
    color: rgba(0, 0, 0, 0.4);
  }


</style>
