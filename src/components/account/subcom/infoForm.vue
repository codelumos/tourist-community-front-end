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
            <Input placeholder="用户名" v-model="accountInfo.name"/>
            </Col>
            <Col span="1" offset="3">
            <label>密码：</label>
            </Col>
            <Col span="4">
            <Input type="password" placeholder="密码" v-model="accountInfo.password"/>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>性别：</label>
            </Col>
            <Col span="4">
            <Select v-model="accountInfo.sex">
              <Option value="m">男</Option>
              <Option value="f">女</Option>
            </Select>
            </Col>
            <Col span="1" offset="3">
            <label>生日：</label>
            </Col>
            <Col span="4">
            <Input type="date" placeholder="生日" v-model="accountInfo.birthday"/>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>家乡：</label>
            </Col>
            <Col span="4">
            <Cascader :data="address" v-model="accountInfo.homelp"></Cascader>
            </Col>
            <Col span="1" offset="3">
            <label>现住地：</label>
            </Col>
            <Col span="4">
            <Cascader :data="address" v-model="accountInfo.homelp"></Cascader>
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

  import {mapState} from 'vuex';

  export default {
    name: "infoForm",
    data() {
      return {
        address: [],
        hometown: [],
        residence: []
      }
    },
    methods: {
      initAddress(){
        var that = this;
        var url = '../../../static/data/address.json';

        this.$http.get(url).then(function (response) {

          that.address = response.data;
        }).catch(function (error) {
          that.$Message.warning(error);
        });

      },
      accountAddress(){
        this.hometown = this.$store.state.account.accountInfo.homelp;
        this.residence = this.$store.state.account.accountInfo.homelp;
      },
      submit(){
        alert("存储用户信息");
      }
    },
    created(){
      this.initAddress();
      // this.accountAddress();
    },
    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      })
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
