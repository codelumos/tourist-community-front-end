<template>
  <form class="Inputform" @submit.prevent="login">
    <div class="form-body">

      <span>驴友，请登录</span>
      <input type="text" class="form-input" name="username" placeholder="账号">
      <input type="password" class="form-input" name="password" placeholder="密码">
      <div class="form-group">
        <label for="remember"><input type="checkbox" id="remember"> 记住我？</label>
      </div>
      <div class="form-group">
        <p>还没成为网上驴友？ <router-link to="/accountForm/register">注册</router-link></p>
      </div>
      <div class="form-button">
        <input type="submit" class="form-submit">
        <router-link to="/index" class="form-return"><span>返回首页</span></router-link>
      </div>
    </div>
  </form>
</template>

<script>
    export default {
        name: "login",
        methods: {
          login(){
            alert("登录");
          }
        }
    }
</script>

<style scoped>
  .Inputform
  {
    /*width: 100%;*/
    /*display: inline-block;*/
    height: 500px;
    background: #fff;
    border-radius: 5px;
    box-shadow: -4px 7px 46px 2px rgba(0, 0, 0, 0.1);
    overflow: hidden;
  }

  .Inputform>.form-body
  {
    padding: 30px;
  }
  .Inputform>.form-body>span
  {
    display: inline-block;
    text-transform: uppercase;
    letter-spacing: 2px;
    font-size: 20px;
    margin: 0 0 30px 0;
    color: #000;
  }
  .Inputform .form-input
  {
    display: block;
    width: 90%;
    font-size: 16px;
    font-weight: 300;
    height: 50px;
    margin-bottom: 30px;
    border: none;
    border-bottom: 1px solid rgba(0, 0, 0, 0.1);
    box-shadow: none;
    border-radius: 0px;
    transition: all 0.3s ease;
    outline: none;
  }
  .Inputform .form-group
  {
    margin-bottom: 30px;
  }
  .Inputform .form-group>label
  {
    font-family: "Open Sans", Arial, sans-serif;
    line-height: 1.5;
    font-size: 14px;
    font-weight: 300;
  }
  .Inputform .form-group>label>input
  {
    margin: 4px 0 0;

    line-height: normal;
  }

  .Inputform .form-group>p
  {
    font-size: 16px;
    color: #9f9f9f;
    font-weight: 300;
  }
  .Inputform .form-group>p>a
  {
    color: #000000
  }
  .Inputform .form-group>p>a:hover
  {
    color: #f74133;
  }

  .Inputform .form-submit
  {
    display: inline-block;
    font-family: "Open Sans", Arial, sans-serif;
    line-height: 1.5;
    font-size: 16px;
    height: 50px;
    border-radius: 4px;
    -webkit-appearance: button;
    cursor: pointer;
    padding-right: 20px;
    padding-left: 20px;
    border: none;
    background: #33cccc;
    color: #ffffff;
    box-shadow: -2px 10px 20px -1px rgba(51, 204, 204, 0.4);
    margin-top: 2px;
  }
  .Inputform .form-button
  {
    position: relative;
  }
  .Inputform .form-return
  {
    display: inline-block;
    font-family: "Open Sans", Arial, sans-serif;
    line-height: 1.5;
    font-size: 16px;
    height: 50px;
    border-radius: 4px;
    position: absolute;
    top: 0;
    cursor: pointer;
    padding-right: 20px;
    padding-left: 20px;
    margin-left: 60px;
    vertical-align:middle;
    border: 1px solid rgba(246, 246, 246, 0.4);
    background: #fff;
    background: -webkit-linear-gradient(#fff, #eee); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient(#fff, #eee); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(#fff, #eee); /* Firefox 3.6 - 15 */
    background: linear-gradient(#fff, #eee); /* 标准的语法 */
    color: #000000;
    box-shadow: -2px 10px 20px -1px rgba(0,0,0,0.2);
  }
  .Inputform .form-return>span
  {
    display: inline-block;
    margin-top: 12px;
  }
</style>
