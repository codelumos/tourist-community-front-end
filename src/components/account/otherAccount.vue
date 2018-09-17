<template>
  <!--个人中心界面-->
  <div class="tmpl">
    <headNav></headNav>
    <div class="account-background">
      <div class="account-avatar">
        <img :src="account.imagePath" alt="头像">
      </div>
      <div class="account-name">
        <input type="text" v-model="account.userName" maxlength="20">
        <div>
          <Icon type="md-happy" />
          <span>账号:{{account.userId}}</span>
        </div>
      </div>
    </div>
    <otherInfo v-if="account.userId" :account="account"></otherInfo>
    <footNav></footNav>
    <backTop></backTop>

  </div>
</template>

<script>
  import headNav from '../subcom/headNav-white';
  import footNav from '../subcom/footNav';
  import backTop from '../subcom/backTop';
  import otherInfo from './subcom/otherInfo';

  import common from '../../common/common';

  export default {
    name: "account",
    data () {
      return {
        id: 0,
        account: {}
        }

    },

    methods:{
      async initAccount(){
        var url = common.apidomain + "/accounts?userId=" + this.id;
        var that = this;
        await this.$http.get(url).then(function (response) {
          var data = response.data;
          if(data.status === 1){
            that.account = data.message;

          }
        });
      }

    },
    created(){
      // 将用户信息查出
      this.id = this.$route.params.id;
      this.initAccount();

    },
    components: {
      headNav,
      footNav,
      backTop,
      otherInfo
    }
  }
</script>

<style scoped>
  .account-background {
    /*position: fixed;*/
    overflow: hidden;
    width: 100%;
    height: 380px;
    /*background-image: linear-gradient(135deg, #5EFCE8 10%, #736EFE 100%);*/
    background-image: linear-gradient( 135deg, #FEB692 10%, #EA5455 100%);
  }
  .account-avatar>img{
    display: block;
    width: 180px;
    height: 180px;
    border-radius: 100%;
    margin: 80px auto 10px;
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
