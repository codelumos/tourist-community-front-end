<template>
  <div class="blogList">
    <headNav></headNav>

    <board></board>

    <!--S: 主体-->
    <div class="main-wrapper">
      <Row>
        <Col span="18" offset="3">
          <blogCard></blogCard>
          <blogCard></blogCard>
        <travelCard></travelCard>
        <travelCard></travelCard>
        </Col>
      </Row>

    </div>
    <!--E: 主体-->

    <backTop></backTop>
    <footNav></footNav>
  </div>
</template>

<script>
  import board from './subcom/board';
  import headNav from '../subcom/headNav-white';
  import backTop from '../subcom/backTop';
  import footNav from '../subcom/footNav';

  import blogCard from './subcom/blogCard';
  import travelCard from '../mate/subcom/travelCard2';

  export default {
    name: "blog-list",
    data(){
     return {
       blogList: [
         {

         },
         {}
       ]
     };
    },
    created(){

    },
    components:{
      board,
      headNav,
      backTop,
      footNav,
      blogCard,
      travelCard
    }
  }
</script>

<style scoped>
  .blogList {
    width: 100%;
    overflow: hidden;
  }

</style>
