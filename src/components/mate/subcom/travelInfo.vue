<template>
  <div class="travelInfo">
    <Col span="14" offset="2">
    <Card style="width: 100%;margin-bottom: 20px">
      <div class="card-context">
        <div class="card-head">

            <span class="card-author">
              <img src="https://dev-file.iviewui.com/userinfoUgdSyCi1athTzPW4JyvsAKrUdPRxrj8i/avatar" alt="">
            </span>

          <h3>
            <router-link to="/travel/travelInfo">国庆北京-西安-成都 自驾</router-link>
          </h3>
        </div>
        <div class="card-body">
          <div class="topic-list-content">
            <p>听了《成都》，就一直也想去成都的街头走一走，这次终于有时间，来一场成都的旅行。第一站：西安。看一看西安壮观的兵马俑，吃一吃西安的小吃。停留一天。第二站：直奔成都。要在成都住上几天，去锦里吃遍成都的美食</p>
            <img src="../../../../static/img/travelInfo.jpg" alt="">
          </div>
        </div>
        <div class="card-bottom">
          <div class="topic-list-subtitle clearfix">
            <a>#09-29北京出发#</a>
            <a>摄影</a>
            <a>自驾</a>
            <a>随性</a>
          </div>
        </div>
        <Divider/>
        <comment></comment>
      </div>
    </Card>
    </Col>
  </div>
</template>

<script>
  import comment from '../../subcom/comment';

    export default {
        name: "travel-info",
      components:{
        comment
      }
    }
</script>

<style scoped>
  .travelInfo{
    min-height: 500px;
  }
  .card-head{
    width: 100%;
  }
  .card-head h3{
    display: inline-block;
    vertical-align: top;
    /*float: left;*/
  }
  .card-context{
    padding: 16px;
  }

  .card-author{
    display: inline-block;
    width: 24px;
    height: 24px;
    margin-right: 12px;
  }
  .card-author img{
    width: 24px;
    height: 24px;
    border-radius: 100%;
  }

  .title h3 {
    font-size: 16px;
    line-height: 1.3;
    background: 0;
    width: 523px;
  }
  a {
    color: #17233d;
    text-decoration: none
  }
  a:hover{
    color: #2d8cf0
  }

  .title .topic-list-count a {
    font-size: 12px;
    line-height: 14px;
    border-radius: 2px;
    display: inline-block;
    background-color: #F9E9D8;
    color: #825d5b;
    padding: 2px 6px
  }

  .title .topic-list-count a:hover {
    background-color: #F8E0C6
  }

  .topic-list-subtitle {
    font-size: 14px;
    text-align: right;
    margin-top: 20px;
  }

  .topic-list-content {
    margin-top: 10px;
  }

  .topic-list-content p {
    font-size: 16px;
    text-indent: 2em;
    color: #666;
    margin: 0
  }
  .topic-list-content img{
    margin-top: 10px;
    width: 100%;
    border-radius: 5px;
  }
</style>
