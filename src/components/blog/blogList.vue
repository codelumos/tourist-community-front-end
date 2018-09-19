<template>
  <div class="blogList">
    <headNav></headNav>

    <board v-if="articles.articles && articles.articles.length != 0" :blog="articles.articles[0]"></board>
    <!--S: 主体-->
    <div class="main-wrapper">
      <Row>
        <Col span="18" offset="3">
        <div>
          <h2 style="float: left">搜索博客</h2>
        </div>
        <br>
        <br/>
        <hr/>
        <br/>
        <div class="eception" v-if="articles.articles && articles.articles.length === 0" >
          这里还没有博客....
        </div>
        <blogCard :articles="articles" ></blogCard>

        <div>
          <h2 style="float: left">搜索拼途</h2>
        </div>
        <br>
        <br/>
        <hr/>
        <br/>
        <div v-if="travelList.appointments && travelList.appointments.length === 0" class="none">
          啥拼途都找不到了....
        </div>
        <travelCard v-else :travelList="travelList"></travelCard>

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

  import common from '../../common/common';

  export default {
    name: "blog-list",
    data(){
     return {
        keyword: '',
       articles: [],
       travelList: [],

     };
    },
    methods:{
      async initArticles(){
        var that = this;
        var url = common.apidomain + "/articlesByKeyword?keyword=" + this.keyword;
        await this.$http.get(url).then(function (response) {

          var data = response.data;
          if(data.status === 0){
            that.articles = data.message;

          }else{
            that.$Message.warning({
              content: data.message,
              duration: 5
            });

          }
        });
      },
      async initTravel(){
        var that = this;
        var url = common.apidomain + "/appointmentsByKeyword?keyword=" + this.keyword;
        await this.$http.get(url).then(function (response) {
          var data = response.data;
          if(data.status === 0){

            that.travelList = data.message;
          }else{
            that.$Message.warning({
              content: data.message,
              duration: 5
            });
          }
        })

      },
    },
    created(){
      this.keyword = this.$route.params.keyword;
      this.initArticles();
      this.initTravel();

    },
    beforeRouteUpdate(to,from,next){
      next();
      this.keyword = this.$route.params.keyword;
      this.initArticles();
      this.initTravel();
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
  .main-wrapper{
    margin-top: 80px;
    min-height: 605px;
  }
  .eception{
    font-size: 30px;
    text-align: center;
    font-weight: bold;
    margin-top: 120px;
  }
  .none{
    font-size: 30px;
    text-align: center;
    font-weight: bold;
    margin-top: 120px;
  }

</style>
