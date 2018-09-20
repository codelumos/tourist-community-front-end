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
            <li>
              <router-link to="/index">首页</router-link>
            </li>
            <li><a href="javascript:void(0)" @click="toBlog()" >写博客</a></li>
            <li>
              <a href="javascript:void(0)" @click="toTravel()" >拼途</a>
            </li>
            <li v-if="accountInfo">
              <a href="javascript:void(0)" @click="flag = true">注销</a>
            </li>
            <li v-else>
              <router-link to="/accountForm/login">登录</router-link>
            </li>
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
  import {mapState, mapMutations} from 'vuex'
  import {ACCOUNTLOGOUT,CANCELBLOG} from "@/store/mutations/mutation-types";

  export default {
    name: "headnav",
    data() {
      return {
        flag: false
      };
    },
    methods: {
      ...mapMutations([ACCOUNTLOGOUT]),
      ok() {
        this.$store.commit(ACCOUNTLOGOUT);
        this.$store.commit(CANCELBLOG);
      },
      toBlog() {
        if (this.$store.state.account.accountInfo) {
          this.$router.push({path: '/editor'})
        } else {
          this.$Message.warning({
            content: "请先登录",
            duration: 5
          })
        }
      },
      toTravel() {
        if (this.$store.state.account.accountInfo) {
          this.$router.push({path: '/travel/travelList'})
        } else {
          this.$Message.warning({
            content: "请先登录",
            duration: 5
          })
        }
      }

    },
    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      })
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
    background: rgba(0, 0, 0, 0.3);
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

  a:hover {
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

  .logo img {
    position: absolute;
    top: 5px;
    left: 10px;
    display: inline-block;
    width: 36px;
    height: 36px;
    border-radius: 100%;
  }

  .logo span {
    margin-left: 36px;
  }
</style>
