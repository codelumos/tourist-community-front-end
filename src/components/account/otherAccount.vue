<template>
  <!--个人中心界面-->
  <div class="tmpl">
    <headNav></headNav>
    <div class="account-background">
      <div class="account-avatar">
        <img src="http://img1.lotour.net/Inspiration/2015/1204/20151204213355229789732_310.jpg " alt="头像">
      </div>
      <div class="account-name">
        <input type="text" maxlength="20" value="善良酱" readonly>
        <div>
          <Icon type="md-happy" />
          <span>乐途，搜狐，QQ公众号，企鹅号，头条等平台自媒体。</span>
        </div>
      </div>
    </div>
    <otherInfo></otherInfo>
    <footNav></footNav>
    <backTop></backTop>

  </div>
</template>

<script>
  import headNav from '../subcom/headNav-white';
  import footNav from '../subcom/footNav';
  import backTop from '../subcom/backTop';
  import otherInfo from './subcom/otherInfo';

  export default {
    name: "account",
    data () {
      return {
        }

    },
    methods:{
      initAddress(){

        var url = '../../../static/data/address.json';

        this.$http.get(url).then(function (response) {
          alert(response.data);
          this.address = response.data;
        }).catch(function (response) {
          alert(response);
        });

        console.log(this.address);
      }

    },
    created(){
      // 将用户信息查出

      // this.initAddress();
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
