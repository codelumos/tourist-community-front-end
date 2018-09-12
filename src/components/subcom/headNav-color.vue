<template>
  <div class="headnav">
    <Row>
      <Col span="24">
      <header>
        <nav>
          <div class="logo">
            <router-link to="/account">
              一把健
            </router-link>
          </div>
          <ul>
            <li><router-link to="/index" class="active">首页</router-link></li>
            <li><router-link to="/editor">写博客</router-link></li>
            <li>
              <router-link to="/travel/travelList">拼途</router-link>
            </li>
            <li><a href="javascript:void(0)" @click="flag = true">注销</a></li>
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
  import {mapMutations} from 'vuex'
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
        this.$router.push({path: '/index'});
      },
      cancel(){}
    }

  }
</script>

<style scoped>
  .headnav {
    position: absolute;
    top: 0;
    width: 100%;
  }

  nav {
    height: 50px;
    /*background: #2d8cf0;*/
    background-image: linear-gradient( 135deg, #6B73FF 10%, #000DFF 100%);
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

    color: #fff;

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

    color: #fff;
  }
</style>
