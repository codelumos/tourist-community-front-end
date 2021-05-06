<template>
  <div class="footNav">
    <a href="https://github.com/HaoNShi"  target="_blank">
      HaoNShi
    </a>
  </div>
</template>

<script>
  export default {
    name: "foot-nav-white"
  }
</script>

<style scoped>
  .footNav
  {
    width: 100%;
    height: 150px;
    background: #fff;
    text-align: center;
    margin-top: 10px;
    border-top: 1px solid #eee;
  }
  .footNav>a
  {
    display: inline-block;
    position: relative;
    top: 50px;
    color: #999999;
    font-size: 20px;

  }
  .footNav>a:hover
  {
    color: #555555;
  }
</style>
