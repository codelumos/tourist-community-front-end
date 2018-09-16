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
      <travelCard :travelList="travelList"></travelCard>

      </Col>

      <Col span="6">
      <div class="choice-card-group">
        <Col span="6">
        <Card class="card">
          <div class="card-context">
            <div class="card-title">
              <h2>拼途查询</h2>
              <router-link class="mine" v-bind="{to:'/travel/travelList/'+this.$store.state.account.accountInfo.userId}"
                           title="我的">我的
              </router-link>
            </div>
            <Divider/>
            <div class="time-choice">
              <h3>出发日期</h3>
              <ul>
                <li>
                  <router-link class="link-on" to="/travel/travelList/0">全部</router-link>
                </li>
                <li><a href="" title="驴友9月结伴旅行">9月</a></li>
                <li><a href="" title="驴友中秋节结伴旅行">中秋节</a></li>
                <li><a href="" title="驴友10月结伴旅行">10月</a></li>
                <li><a href="" title="驴友国庆节结伴旅行">国庆节</a></li>
                <li><a href="" title="驴友11月结伴旅行">11月</a></li>
                <li><a href="" title="驴友12月结伴旅行">12月</a></li>
              </ul>
            </div>
            <Divider/>
            <div class="place-choice">
              <h3>目的地</h3>
              <ul>
                <li>
                  <router-link class="link-on" to="/travel/travelList/0">全部</router-link>
                </li>
                <li><a href="" title="丽江驴友网">丽江</a></li>
                <li><a href="" title="拉萨驴友网">拉萨</a></li>
                <li><a href="" title="西藏驴友网">西藏</a></li>
                <li><a href="" title="云南驴友网">云南</a></li>
                <li><a href="" title="大理驴友网">大理</a></li>
                <li><a href="" title="香格里拉驴友网">香格里拉</a></li>
                <li><a href="" title="成都驴友网">成都</a></li>
                <li><a href="" title="青海驴友网">青海</a></li>
                <li><a href="" title="昆明驴友网">昆明</a></li>
                <li><a href="" title="厦门驴友网">厦门</a></li>
                <li><a href="" title="北京驴友网">北京</a></li>
                <li><a href="" title="西宁驴友网">西宁</a></li>
                <li><a href="" title="杭州驴友网">杭州</a></li>
                <li><a href="" title="西安驴友网">西安</a></li>
                <li><a href="" title="上海驴友网">上海</a></li>
                <li><a href="" title="泰国驴友网">泰国</a></li>
                <li><a href="" title="三亚驴友网">三亚</a></li>
                <li><a href="" title="敦煌驴友网">敦煌</a></li>
                <li><a href="" title="亚丁驴友网">亚丁</a></li>
                <li><a href="" title="稻城驴友网">稻城</a></li>
              </ul>
              <Input placeholder="输入地点" style="width: 200px" v-model="place"/>
              <Button type="primary" shape="circle" @click="searchByplace()">GO!</Button>
            </div>
            <Divider/>
            <div class="theme-choice">
              <h3>主题玩法</h3>
              <ul>
                <li>
                  <router-link class="link-on" to="/travel/travelList/0">全部</router-link>
                </li>
                <li>
                  <a href="" title="驴友自驾结伴旅行">自驾</a>
                </li>
                <li>
                  <a href="" title="驴友随性结伴旅行">随性</a>
                </li>
                <li>
                  <a href="" title="驴友摄影结伴旅行">摄影</a>
                </li>
                <li>
                  <a href="" title="驴友穷游结伴旅行">穷游</a>
                </li>
                <li>
                  <a href="" title="驴友吃货结伴旅行">吃货</a>
                </li>
                <li>
                  <a href="" title="驴友学生结伴旅行">学生</a>
                </li>
                <li>
                  <a href="" title="驴友徒步结伴旅行">徒步</a>
                </li>
                <li>
                  <a href="" title="驴友发呆结伴旅行">发呆</a>
                </li>
                <li>
                  <a href="" title="驴友搭车结伴旅行">搭车</a>
                </li>
                <li>
                  <a href="" title="驴友极限结伴旅行">极限</a>
                </li>
                <li>
                  <a href="" title="驴友艳遇结伴旅行">艳遇</a>
                </li>
                <li>
                  <a href="" title="驴友露营结伴旅行">露营</a>
                </li>
                <li>
                  <a href="" title="驴友血拼结伴旅行">血拼</a>
                </li>
                <li>
                  <a href="" title="驴友毕业季结伴旅行">毕业季</a>
                </li>
                <li>
                  <a href="" title="驴友骑行结伴旅行">骑行</a>
                </li>
                <li>
                  <a href="" title="驴友房车结伴旅行">房车</a>
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
    </div>
    <!--E: 主体部分-->
  </div>
</template>

<script>
  import travelCard from './travelCard2';
  import choiceCard from './choiceCard';
  import common from '../../../common/common';

  export default {
    name: "travel-list",
    data() {
      return {
        travelList: [],
        id: 0,
        place: '',
      }
    },
    methods: {
      initTravelList() {
        var that = this;
        var url = common.apidomain + "/appointmentsByAuthor?authorId=" + this.id;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {

            that.travelList = data.message;
          } else {
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })
      },
      searchByplace(){
          if(this.place.trim().length > 0){
            var that = this;
            var url = common.apidomain + "/appointmentsByPlaceName?placeName=" + this.place;
            this.$http.get(url).then(function (response) {
              var data = response.data;
              if(data.status === 0){
                that.travelList = data.message;
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

      }
    },
    created() {

      // 获取传入的 id
      this.id = this.$route.params.id;
      console.log(this.id)
      this.initTravelList();

    },
    components: {
      travelCard,
      choiceCard
    },
    // 实现路由锚点相同但是锚点参数不同的跳转
    beforeRouteUpdate(to, from, next) {

      next();
      this.id = this.$route.params.id;
      this.initTravelList();

    }
  }
</script>

<style scoped>
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
