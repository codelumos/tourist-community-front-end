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
      blogCard
    }
  }
</script>

<style scoped>
  .blogList {
    width: 100%;
    overflow: hidden;
  }

</style>
