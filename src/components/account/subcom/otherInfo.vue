<template>
  <div class="form">
    <Tabs value="info">
      <TabPane label="用户信息" name="info">
        <div class="account-info">
          <Row class="account-group">
            <Col span="1" offset="6">
              <label>用户名：</label>
            </Col>
            <Col span="4">
              <label v-text="account.userName"></label>
            </Col>
            <Col span="1" offset="3">
              <label>性别：</label>
            </Col>
            <Col span="4">
              <label v-text="account.sex='m'?'男':'女'"></label>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
              <label>家乡：</label>
            </Col>
            <Col span="4">
              <Cascader :data="address" v-model="account.home" disabled></Cascader>

            </Col>
            <Col span="1" offset="3">
              <label>标签：</label>
            </Col>
            <Col span="4">
              <label>
                <Tag v-if="account.tag1" :key="1" :name="account.tag1">{{ account.tag1 }}
                </Tag>
                <Tag v-if="account.tag2" :key="2" :name="account.tag2">{{ account.tag2 }}
                </Tag>
                <Tag v-if="account.tag3" :key="3" :name="account.tag3">{{ account.tag3 }}
                </Tag>
              </label>
            </Col>
          </Row>
        </div>
      </TabPane>
      <TabPane label="博客" name="blog">
        <div class="account-blog">
          <Row>
            <Col span="18" offset="3">
              <blogCard :articles="articles"></blogCard>
            </Col>
          </Row>
        </div>
      </TabPane>
      <TabPane label="拼途" name="travel">
        <div class="account-travel">
          <Row>
            <Col span="16" offset="4">
              <travelCard :travelList="travelList"></travelCard>
            </Col>
          </Row>
        </div>
      </TabPane>
    </Tabs>
  </div>
</template>

<script>
  import blogCard from '../../blog/subcom/blogCard';
  import upload from '../subcom/upload';
  import travelCard from '../../mate/subcom/travelCard2';

  import common from '../../../common/common';

  export default {
    name: "infoForm",
    data() {
      return {
        address: [],
        articles: [],
        travelList: [],
        addressText:''
      }
    },
    props: ['account'],
    methods: {

      initAddress() {
        var that = this;
        var url = '../../../static/data/address.json';

        this.$http.get(url).then(function (response) {
          that.address = response.data;
        }).catch(function (error) {
          that.$Message.warning(error);
        });

      },
      initArticles() {
        var that = this;
        var url = common.apidomain + "/articlesByAuthor?authorId=" + this.account.userId;
        this.$http.get(url).then(function (response) {

          var data = response.data;
          if (data.status === 0) {
            that.articles = data.message;
          } else {
            that.$Message.warning({
              content: data.message,
              duration: 5
            });
          }
        });
      },
      initTravel() {
        var that = this;
        var url = common.apidomain + "/appointmentsByAuthor?authorId=" + this.account.userId;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {
            that.travelList = data.message;
          } else {
            that.$Message.warning({
              content: data.message,
              duration: 5
            });
          }
        })
      },

    },
    created() {

      // 用户个人信息 填充
      this.initAddress();

      // 用户博客信息 填充
      this.initArticles();

      // 用户拼途信息 填充
      this.initTravel();

    },
    components: {
      upload,
      blogCard,
      travelCard
    }
  }
</script>

<style scoped>
  .account-info {
    padding: 50px;
  }

  .account-info label {
    vertical-align: middle;
    display: inline-block;
    font: normal 16px/28px \5FAE\8F6F\96C5\9ED1, "Microsoft YaHei";
  }

  .account-group {
    margin-bottom: 20px;
  }
</style>
