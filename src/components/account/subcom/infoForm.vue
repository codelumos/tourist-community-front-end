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
            <Input placeholder="用户名" v-model="account.userName"/>
            </Col>
            <Col span="1" offset="3">
            <label>密码：</label>
            </Col>
            <Col span="4">
            <Input type="password" placeholder="密码" v-model="account.password"/>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>性别：</label>
            </Col>
            <Col span="4">
            <Select v-model="account.sex">
              <Option value="m">男</Option>
              <Option value="f">女</Option>
            </Select>
            </Col>
            <Col span="1" offset="3">
            <label>生日：</label>
            </Col>
            <Col span="4">
            <Input type="date" placeholder="生日" v-model="accountBirth"/>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>家乡：</label>
            </Col>
            <Col span="4">
            <Cascader :data="address" v-model="account.home"></Cascader>
            </Col>
            <Col span="1" offset="3">
            <label>现住地：</label>
            </Col>
            <Col span="4">
            <Cascader :data="address" v-model="account.live"></Cascader>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>描述：</label>
            </Col>
            <Col span="4">
            <Input type="textarea" v-model="account.description"/>
            </Col>
            <Col span="1" offset="3">
            <label>标签：</label>
            </Col>
            <Col span="4">
            <Input class="tagInput" placeholder="输入标签,最多三条" v-model="tag"/>
            <Tag v-if="account.tag1" :key="1" :name="account.tag1" closable @on-close="handleClose">{{ account.tag1 }}
            </Tag>
            <Tag v-if="account.tag2" :key="2" :name="account.tag2" closable @on-close="handleClose">{{ account.tag2 }}
            </Tag>
            <Tag v-if="account.tag3" :key="3" :name="account.tag3" closable @on-close="handleClose">{{ account.tag3 }}
            </Tag>
            <Button v-if="!(account.tag1 && account.tag2 && account.tag3)" icon="ios-add" type="dashed" size="small"
                    @click="handleAdd">添加标签
            </Button>
            </Col>
          </Row>
          <Row>
            <Col span="1" offset="6">
            <label>头像：</label>
            </Col>
            <Col span="4">
              <upload @getImage="getImage" :initImage="account.imagePath"></upload>
            </Col>

          </Row>
          <br>
          <Row class="account-group">
            <Col span="4" offset="12">
            <Button type="success" size="large" @click="submit()">提交</Button>
            </Col>

          </Row>


        </div>
      </TabPane>
      <TabPane label="博客" name="blog">
        <div class="account-blog">
          <Row>
            <Col span="18" offset="3">

              <div class="eception" v-if="articles.articles.length === 0" >
              这里还没有博客....
              </div>
              <blogCard v-else :articles="articles"></blogCard>
            </Col>
          </Row>
        </div>
      </TabPane>
      <TabPane label="拼途" name="travel">
        <div class="account-travel">
          <Row>
            <Col span="16" offset="4">

              <div v-if="travelList.appointments.length === 0" class="none">
               啥拼途都找不到了....
              </div>
              <travelCard v-else :travelList="travelList"></travelCard>
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
  import Moment from 'moment';
  import travelCard from '../../mate/subcom/travelCard2';

  import {mapState, mapMutations} from 'vuex';
  import {INITACCOUNT} from "../../../store/mutations/mutation-types";

  import common from '../../../common/common';

  export default {
    name: "infoForm",
    data() {
      return {
        account: {},
        address: [],
        hometown: [],
        tag: '',
        articles: [],
        travelList: []
      }
    },
    methods: {
      ...mapMutations([INITACCOUNT]),
      initAddress() {
        var that = this;
        var url = '../../../static/data/address.json';

        this.$http.get(url).then(function (response) {

          that.address = response.data;
        }).catch(function (error) {

          that.$Message.warning(error);
        });

      },
      initArticles(){
        var that = this;
        var url = common.apidomain + "/articlesByAuthor?authorId=" + this.account.userId;
        this.$http.get(url).then(function (response) {

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
      initTravel(){
        var that = this;
        var url = common.apidomain + "/appointmentsByAuthor?authorId=" + this.account.userId;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if(data.status === 0){

            that.travelList = data.message;

          }else{
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        })

      },
      submit() {
        // 向数据库中存入该信息
        var that = this;
        var url = common.apidomain + "/accounts";

        this.$http.put(url, this.account).then(function (response) {

          var data = response.data;
          if (data.status === 0) {

            that.$store.commit(INITACCOUNT, that.account);
            that.$Message.success({
              content: data.message,
              duration: 5
            });
          } else {

            that.$Message.success({
              content: data.message,
              duration: 5
            });
          }
        });


      },
      handleAdd() {
        if(this.tag.trim().length === 0){
          this.$Message.warning({
            content: '请输入标签内容',
            duration: 5
          });
        }else{
          if (this.account.tag1.trim().length === 0) {
            this.account.tag1 = this.tag;
          } else if (this.account.tag2.trim().length === 0) {
            this.account.tag2 = this.tag;
          } else {
            this.account.tag3 = this.tag;
          }
          this.tag = "";
        }

      },
      handleClose(event, name) {
        if (this.account.tag3) {
          this.account.tag3 = "";
        } else if (this.account.tag2) {
          this.account.tag2 = "";
        } else {
          this.account.tag1 = "";
        }
      },
      getImage(image){
          this.account.imagePath = image;
      }
    },
    created() {

      // 用户个人信息 填充
      this.account = Object.assign({}, this.accountInfo);
      this.$emit('account',this.account);
      this.initAddress();

      // 用户博客信息 填充
      this.initArticles();

      // 用户拼途信息 填充
      this.initTravel();

    },
    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      }),
      accountBirth: {
        get: function () {
          return Moment(Date.parse(this.account.birthday)).format("YYYY-MM-DD");
        },
        // setter
        set: function (newValue) {
          this.account.birthday = newValue;
        }
      },


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

  .tagInput {
    margin-bottom: 10px;
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
