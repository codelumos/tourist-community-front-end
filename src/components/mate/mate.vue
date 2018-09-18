<template>
  <div class="tmpl">
    <!--S: 顶部导航栏组件-->
    <headNav class="headNav"></headNav>
    <!--E: 顶部导航栏组件-->
    <div class="desc">
      <h1>跟随兴趣去旅行，全年随时出发</h1>
      <p>世界很大，给不安分的心一个躁动的理由</p>
    </div>
    <br>

    <Row>
      <Col span="14" offset="2">
        <router-view :travelList="travelList"></router-view>
      </Col>

      <Col span="6">
        <div class="choice-card-group">
        <Col span="6">
        <Card class="card">
          <div class="card-context">
            <div class="card-title">
              <h2>拼途查询</h2>
              <a class="mine" title="我的" @click="initTravelList(accountInfo.userId)">我的
              </a>
            </div>
            <Divider/>
            <div class="time-choice">
              <h3>出发日期</h3>
              <ul>
                <li>
                  <a class="link-on" href="javascript:void(0)" @click="initTravelList(0)">全部</a>
                </li>
                <li v-for="item in monthArr"><a href="javascript:void(0)" @click="searchBymonth(item)">{{item}}月</a></li>
              </ul>
            </div>
            <Divider/>
            <div class="place-choice">
              <h3>目的地</h3>
              <ul>
                <li>
                  <a class="link-on" href="javascript:void(0)" @click="initTravelList(0)">全部</a>
                </li>
                <li v-for="item in placeArr"><a href="javascript:void(0)" @click="searchByPlace(item.spotName)">{{item.spotName}}</a></li>
              </ul>
              <Input placeholder="输入地点" style="width: 200px" v-model="place"/>
              <Button type="primary" shape="circle" @click="searchByplaceWord()">GO!</Button>
            </div>
            <Divider/>
            <div class="theme-choice">
              <h3>主题玩法</h3>
              <ul>
                <li>
                  <a class="link-on" href="javascript:void(0)" @click="initTravelList(0)">全部</a>
                </li>
                <li v-for="tag in tagArr">
                  <a href="javascript:void(0)" v-bind="{title:'驴友'+tag.tagName+'结伴旅行'}" @click="searchBytag(tag.tagName)">{{tag.tagName}}</a>
                </li>
              </ul>
            </div>
            <div class="launch">

              <router-link to="/travel/launchTravel">
                <Button type="success" long>发起拼途</Button>
              </router-link>
            </div>
          </div>
        </Card>
        </Col>
      </div>
      </Col>
    </Row>


    <backTop></backTop>
    <!--S：页脚部分-->
    <footNav></footNav>
    <!--E：页脚部分-->
  </div>
</template>

<script>
  import headNav from '../subcom/headNav-white.vue';
  import footNav from '../subcom/footNav-white';
  import backTop from '../subcom/backTop';

  import common from '../../common/common';

  import {mapState} from 'vuex'

  export default {
    name: "mate",
    data() {
      return {
        travelList: [],
        monthArr:[1,2,3,4,5,6,7,8,9,10,11,12],
        tagArr: [],
        placeArr: [],
        place: '',
        id: 0
      };
    },
    methods: {
      initTravelList(id) {

        var that = this;
        var url = common.apidomain + "/appointmentsByAuthor?authorId=" + id;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.travelList = data.message;
            if(that.$route.path === '/travel/launchTravel'){
              that.$router.push({path: '/travel/travelList'})
            }
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      },
      initTagArr(){
        var that = this;
        var url = common.apidomain + "/allTags";
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.tagArr = data.message;
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      },
      initPlaceArr(){
        var that = this;
        var url = common.apidomain + "/allSpots";
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.placeArr = data.message;
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      },
      searchByplaceWord(){

        if(this.place.trim().length > 0){

          var that = this;
          var url = common.apidomain + "/appointmentsByPlaceName?placeName=" + this.place;
          this.$http.get(url).then(function (response) {
            var data = response.data;
            if(data.status === 0){
              that.travelList = data.message;
              if(that.$route.path === '/travel/launchTravel'){
                that.$router.push({path: '/travel/travelList'})
              }
            }else{
              that.$Message.warning({
                content: data.message,
                duration: 5
              })
            }
          });
        }else{
          this.$Message.warning({
            content: "请输入地点",
            duration: 5
          })
        }

      },
      searchByPlace(spot){
        var that = this;
        var url = common.apidomain + "/appointmentsByPlaceName?placeName=" + spot;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.travelList = data.message;
            if(that.$route.path === '/travel/launchTravel'){
              that.$router.push({path: '/travel/travelList'})
            }
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      },
      searchBymonth(month){
        var that = this;
        var url = common.apidomain + "/appointmentsByTime?time=" + month;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.travelList = data.message;
            if(that.$route.path === '/travel/launchTravel'){
              that.$router.push({path: '/travel/travelList'})
            }
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      },
      searchBytag(tag){
        var that = this;
        var url = common.apidomain + "/appointmentsByTag?tag=" + tag;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.travelList = data.message;
            if(that.$route.path === '/travel/launchTravel'){
              that.$router.push({path: '/travel/travelList'})
            }
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      }
    },
    created() {
      this.initTravelList(0);
      this.initPlaceArr();
      this.initTagArr();
    },
    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      })
    },
    components: {
      headNav,
      footNav,
      backTop
    }
  }
</script>

<style scoped>
  .tmpl{
    background-color: #f8f8f9;

  }
  .headNav
  {
    position: fixed;
    z-index: 3;
  }
  .desc {
    text-align: center;
    margin-top: 80px;
  }

  .desc > p {
    margin-top: 20px;
    font-size: 15px;
    color: rgba(0, 0, 0, 0.4);
  }

  .choice-card-group {
    position: fixed;
    top: 10%;
    left: 70%;
  }

  .card {
    width: 380px;
  }

  .card-context {
    padding: 16px;
  }

  .card-context ul {
    margin-bottom: 20px;
  }

  .card-context ul li {
    margin: 5px;
    display: inline-block;
  }

  .mine {
    display: block;
    margin-top: 10px;
  }

</style>
