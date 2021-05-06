<template>
  <div class="headnav">
    <Row>
      <Col span="24">
      <header>
        <nav>
          <div class="logo">
            <router-link to="/account" v-if="accountInfo">
              <img :src="accountInfo.imagePath" alt="">
              <span>{{accountInfo.userName}}</span>
            </router-link>
            <router-link to="/index" v-else>
              <img src="/static/img/icon.png" alt="">
              <span style="margin-left: 35px">一起旅游吧</span>
            </router-link>
          </div>

          <ul>
            <li><searchInput class="searchInput" style="z-index: 4"></searchInput></li>
            <li><router-link to="/index">首页</router-link></li>
            <li><a href="javascript:void(0)" @click="toBlog()">写博客</a></li>
            <li>
              <a href="javascript:void(0)" @click="toTravel()">拼途</a>
            </li>
            <li v-if="accountInfo"><a href="javascript:void(0)" @click="flag = true">注销</a></li>
            <li v-else><router-link to="/accountForm/login">登录</router-link></li>
            <li v-if="!accountInfo">
              <router-link to="/accountForm/register">
                注册
              </router-link>
            </li>
          </ul>
        </nav>
      </header>
      </Col>
    </Row>
    <Modal
      v-model="flag"
      title="通知"
      @on-ok="ok"
      :styles="{top: '20px'}"
      draggable>
      <p style="font-size: 15px;text-align: center">确定要注销吗？</p>
    </Modal>
  </div>

</template>

<script>
  import searchInput from './searchInput';
  import {mapState,mapMutations} from 'vuex'
  import {ACCOUNTLOGOUT,CANCELBLOG} from "@/store/mutations/mutation-types";

  export default {
    name: "headnav-color",
    data(){
      return {
        flag: false
      };
    },
    methods:{
      ...mapMutations([ACCOUNTLOGOUT]),
      ok(){
        this.$store.commit(ACCOUNTLOGOUT);
        this.$store.commit(CANCELBLOG);
        switch (this.$route.path){
          case '/account':
          case '/editor':
          case '/travel/travelList':
          case '/travel/travelInfo':
            this.$router.push({path: '/accountForm/login'});

        }

      },
      toBlog(){
        if(this.$store.state.account.accountInfo){
          this.$router.push({path: '/editor'})
        }else{
          this.$Message.warning({
            content: "请先登录",
            duration: 5
          })
        }
      },
      toTravel(){
        if(this.$store.state.account.accountInfo){
          this.$router.push({path: '/travel/travelList'})
        }else{
          this.$Message.warning({
            content: "请先登录",
            duration: 5
          })
        }
      }
    },
    components:{
      searchInput
    },
    computed:{
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo
        }
      })
    }

  }
</script>

<style scoped>
  .headnav {

    width: 100%;
    display: block;
    border-bottom: 1px solid #eee;
    box-shadow: 0 1px 3px rgba(26,26,26,.1);
  }

  nav {
    height: 50px;
    background: white;
    z-index: 3;
    position: relative;
    top: 0;
  }

  ul {
    display: inline-block;
    float: right;

    margin: 0;

    list-style: none;
  }

  nav ul li {
    line-height: 50px;

    display: inline-block;

    margin-right: 20px;
  }

  nav ul li a {
    line-height: 50px;

    display: inline-block;

    text-decoration: none;

    color: #000;

  }

  a {
    font-size: 15px;
  }

  a:hover
  {
    color: #f74133;
  }

  nav .logo {
    font-weight: 700;
    line-height: 50px;

    display: inline-block;
    float: left;

    padding-left: 20px;
  }

  nav .logo a {
    text-decoration: none;
    letter-spacing: 1px;

    color: #000;
  }
  .searchInput
  {
    margin: 0;
  }

  .logo img{
    position: absolute;
    top: 5px;
    left: 10px;
    display: inline-block;
    width: 36px;
    height: 36px;
    border-radius: 100%;
  }
  .logo span{
    margin-left: 36px;
  }
</style>
