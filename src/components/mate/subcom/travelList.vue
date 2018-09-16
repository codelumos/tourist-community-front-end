<template>
  <div>
    <!--S: 主体部分-->

    <div class="context">

        <Col span="14" offset="2">
        <div>
          <h2 style="float: left">热门结伴</h2>
        </div>
        <br>
        <br/>
        <hr/>
        <br/>
        <travelCard></travelCard>
        <travelCard></travelCard>
        <travelCard></travelCard>
        <travelCard></travelCard>
        </Col>

        <Col span="6">

        </Col>
    </div>
    <!--E: 主体部分-->
  </div>
</template>

<script>
  import travelCard from './travelCard2';

  export default {
    name: "travel-list",
    data(){
      return {
        travelList: []
      }
    },
    components: {
      travelCard
    }
  }
</script>

<style scoped>

</style>
