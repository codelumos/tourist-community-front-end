<template>
  <div class="tmpl" :style="{height: myHeight}">
    <div class="background" :style="{height: myHeight}">
    </div>

    <headnav></headnav>

    <div class="accountForm">
      <Row>
        <Col span="5" offset="4">
          <div>
            <transition :name="transitionName">
              <router-view class='router'></router-view>
            </transition>

          </div>
        </Col>
      </Row>
    </div>
  </div>

</template>
<script>
  import headnav from '../subcom/headNav';

  export default {
    data(){
      return {
        myHeight: (document.documentElement.clientHeight+'px'),
        transitionName: 'slide-left'
      };
    },
    methods:{

    },
    created(){

    },
    components:{
      headnav
    }

  }
</script>

<style scoped>
  .tmpl
  {
    position: relative;
  }
  .background
  {
    background: url("../../../static/img/login-background.jpg");
    background-position: center center;
    background-repeat: no-repeat;
    background-size: cover;
  }

  div.accountForm
  {
    width: 100%;
    position: absolute;
    top: 130px;
  }

  .router {
    position: absolute;
    width: 100%;
    transition: all .5s;
  }

  .slide-left-enter,
  .slide-right-leave-active {
    opacity: 0;
  }

  .slide-left-leave-active,
  .slide-right-enter {
    opacity: 0;
  }

</style>
