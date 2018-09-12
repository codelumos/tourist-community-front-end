<template>
  <div class="smallCards">
    <ul>
      <li>
        <Card :bordered="false" style="width:195px">
          <div style="text-align:center; padding: 0">
            <router-link class="card" to="/blog">
              <img src="http://img4.lotour.net/bcef/theme//2016/0918/201609181636059776690.jpg" alt="">
              <em>
                <span>地质奇观</span>
              </em>
            </router-link>
          </div>
        </Card>
      </li>
    </ul>
  </div>
</template>

<script>
  export default {
    name: "smallCards"
  }
</script>

<style scoped>

  .smallCards > ul {
    margin: 0 auto;
  }

  .smallCards li {

    padding-bottom: 40px;
    float: left;

    margin-right: 10px;

  }

  .smallCards li a.card {
    border-radius: 5px;
    width: 195px;
    height: 195px;
    overflow: hidden;
    position: relative;
    display: block;
  }

  .smallCards li em {
    width: 195px;
    height: 195px;
    position: absolute;
    top: 0;
    left: 0;
    display: block;
    font: 20px/30px 微软雅黑;
    text-align: center;
    color: #FFF;
    overflow: hidden;
    z-index: 2;
    background: rgba(0, 0, 0, 0.2);
  }

  .smallCards li p {
    font: 12px/20px 微软雅黑;
    color: #b7b7b7;
    padding: 10px 0;
    margin: 0 8px;
  }

  .smallCards li em span {
    padding-top: 90px;
    display: block;
  }

  .small-bottom > a {
    position: relative;
    display: block;
    float: left;
    width: 30px;
    height: 30px;
    margin-right: 10px;
  }

  .small-bottom > a > img {
    border-radius: 100%;
    /* margin-right: 8px; */
    width: 30px;
    height: 30px;
  }

  .small-bottom > a > i {
    margin: 0 auto;
  }

</style>
