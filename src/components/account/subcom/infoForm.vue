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
            <Cascader :data="address" v-model="account.homelp"></Cascader>
            </Col>
            <Col span="1" offset="3">
            <label>现住地：</label>
            </Col>
            <Col span="4">
            <Cascader :data="address" v-model="account.homelp"></Cascader>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>头像：</label>
            </Col>
            <Col span="4">
            <upload></upload>
            </Col>
            <Col span="1" offset="3">
            <label>描述：</label>
            </Col>
            <Col span="4">
            <Input type="textarea"/>
            </Col>
          </Row>
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
            <blogCard></blogCard>

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

  import {mapState,mapMutations} from 'vuex';
  import {INITACCOUNT} from "../../../store/mutations/mutation-types";

  export default {
    name: "infoForm",
    data() {
      return {
        account:{},
        address: [],
        hometown: [],
        residence: []
      }
    },
    methods: {
      ...mapMutations([INITACCOUNT]),
      initAddress(){
        var that = this;
        var url = '../../../static/data/address.json';

        this.$http.get(url).then(function (response) {

          that.address = response.data;
        }).catch(function (error) {
          that.$Message.warning(error);
        });

      },
      submit(){
        this.$store.commit(INITACCOUNT,this.account);
      }
    },
    created(){
      this.account = Object.assign({},this.accountInfo);
      this.initAddress();

    },
    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      }),
      accountBirth:{
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
      blogCard
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
