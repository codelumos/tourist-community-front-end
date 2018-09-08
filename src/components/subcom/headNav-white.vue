<template>
  <div class="headnav">
    <Row>
      <Col span="24">
      <header>
        <nav>
          <div class="logo">
            <a href="#">
              一把健
            </a>
          </div>

          <ul>
            <li><searchInput class="searchInput"></searchInput></li>
            <li><router-link to="/index" class="active">首页</router-link></li>
            <li><router-link to="/editor">写博客</router-link></li>
            <li><router-link to="/account/login">登录</router-link></li>
            <li>
              <router-link to="/account/register">
                注册&nbsp;
              </router-link>
            </li>
          </ul>
        </nav>
      </header>
      </Col>
    </Row>

  </div>

</template>

<script>
  import searchInput from '../subcom/searchInput';

  export default {
    name: "headnav-color",
    data(){
      return {

      };
    },
    components:{
      searchInput
    }

  }
</script>

<style scoped>
  .headnav {

    width: 100%;
    display: block;
    border-bottom: 1px solid #eee;
  }

  nav {
    height: 50px;
    /*background: -webkit-linear-gradient(left top, #0396FF,#ABDCFF); !* Safari 5.1 - 6.0 *!*/
    /*background: -o-linear-gradient(bottom right, #0396FF,#ABDCFF); !* Opera 11.1 - 12.0 *!*/
    /*background: -moz-linear-gradient(bottom right,  #0396FF,#ABDCFF); !* Firefox 3.6 - 15 *!*/
    /*background: linear-gradient(to bottom right,  #0396FF,#ABDCFF); !* 标准的语法 *!*/
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
