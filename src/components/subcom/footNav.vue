<template>
  <div class="footNav">
    <a href="https://github.com/Excalibur-CSU"  target="_blank">
      &copy; Excalibur-CSU
    </a>
  </div>
</template>

<script>
    export default {
        name: "foot-nav"
    }
</script>

<style scoped>
  .footNav
  {
    width: 100%;
    height: 150px;
    background: #121c2d;
    text-align: center;
  }
  .footNav>a
  {
    position: relative;
    top: 50px;
    display: block;
    color: #999999;
    font-size: 20px;

  }
  .footNav>a:hover
  {
    color: #fff;
  }
</style>
