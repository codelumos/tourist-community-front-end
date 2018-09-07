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
  export default {
    name: "headnav-color",
    data(){
      return {

      };
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
    /*background: -webkit-linear-gradient(left top, #0396FF,#ABDCFF); !* Safari 5.1 - 6.0 *!*/
    /*background: -o-linear-gradient(bottom right, #0396FF,#ABDCFF); !* Opera 11.1 - 12.0 *!*/
    /*background: -moz-linear-gradient(bottom right,  #0396FF,#ABDCFF); !* Firefox 3.6 - 15 *!*/
    /*background: linear-gradient(to bottom right,  #0396FF,#ABDCFF); !* 标准的语法 *!*/
    background: #2d8cf0;
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
