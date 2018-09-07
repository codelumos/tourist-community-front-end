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
    name: "headnav",
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
    background: rgba(0, 0, 0, 0.1);
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
