<template>
  <div class="headnav">
    <Row>
      <Col span="24">
      <header>
        <nav>
          <div class="logo">
            <router-link to="/account" v-if="accountInfo">
              一把健
            </router-link>
            <a href="javascript:void(0)" v-else>
              项目LOGO
            </a>
          </div>

          <ul>
            <li><searchInput class="searchInput"></searchInput></li>
            <li><router-link to="/index">首页</router-link></li>
            <li><router-link to="/editor">写博客</router-link></li>
            <li>
              <router-link to="/travel/travelList">拼途</router-link>
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
      @on-cancel="cancel">
      <p style="font-size: 15px;text-align: center">确定要注销吗？</p>
    </Modal>
  </div>

</template>

<script>
  import searchInput from '../subcom/searchInput';
  import {mapState,mapMutations} from 'vuex'
  import {ACCOUNTLOGOUT} from "@/store/mutations/mutation-types";

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
        if(this.$route.path === '/account'){
          this.$router.push({path: '/index'})
        }
      },
      cancel(){}
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
</style>
