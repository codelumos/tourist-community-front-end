<template>
  <!--个人中心界面-->
  <div class="tmpl">
    <headNav></headNav>
    <div class="account-background">
      <div class="account-avatar">
        <img v-if="accountInfo.path" :src="accountInfo.path" alt="头像">
        <img v-else src="../../../static/img/黑子.jpg" alt="头像">
      </div>
      <div class="account-name">
        <input type="text" v-model="accountInfo.name" maxlength="20">
        <div>
          <Icon type="md-happy" />
          <span>账号:{{accountInfo.userId}}</span>
        </div>
      </div>
    </div>
    <infoForm></infoForm>
    <footNav></footNav>
    <backTop></backTop>

  </div>
</template>

<script>
  import headNav from '../subcom/headNav-white';
  import footNav from '../subcom/footNav';
  import backTop from '../subcom/backTop';
  import infoForm from './subcom/infoForm';

  import {mapState} from 'vuex';


  export default {
    name: "account",
    data () {
      return {

      }
    },
    computed:{
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      })
    },
    methods:{

    },
    created(){
      // 将用户信息查出

      // this.initAddress();
    },
    components: {
      headNav,
      footNav,
      backTop,

      infoForm
    }
  }
</script>

<style scoped>
  .account-background {
    /*position: fixed;*/
    overflow: hidden;
    width: 100%;
    height: 380px;
    background-image: linear-gradient(135deg, #5EFCE8 10%, #736EFE 100%);
  }
  .account-avatar>img{
    display: block;
    width: 180px;
    height: 180px;
    border-radius: 100%;
    margin: 80px auto;
    margin-bottom: 10px;
  }
  .account-name>input{
    display: block;
    margin: 0 auto;
    border: none;
    font-size: 30px;
    font-weight: 300;
    border: none;
    box-shadow: none;
    border-radius: 0px;
    background: transparent;
    outline: none;
    text-align: center;
  }
  .account-name
  {
    text-align: center;
  }
  .account-name>div
  {
    margin-top: 20px;
    font-size: 15px;
  }


</style>
