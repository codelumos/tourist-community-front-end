<template>
  <div class="form">
    <Tabs value="info" >
      <TabPane label="用户信息" name="info">
        <div class="account-info">
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>用户名：</label>
            </Col>
            <Col span="4">
            <label>善良酱</label>
            </Col>
            <Col span="1" offset="3">
            <label>性别：</label>
            </Col>
            <Col span="4">
            <label>女</label>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>博客数：</label>
            </Col>
            <Col span="4">
            <label>2</label>
            </Col>
            <Col span="1" offset="3">
            <label>家乡：</label>
            </Col>
            <Col span="4">
            <label>湖南省>长沙市</label>
            </Col>
          </Row>
          <Row class="account-group">
            <Col span="1" offset="6">
            <label>标签：</label>
            </Col>
            <Col span="4">
            <label>
              <Tag color="default">冒险</Tag>
              <Tag color="default">骑行</Tag>
              <Tag color="default">小动物</Tag>
            </label>
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

  export default {
    name: "infoForm",
    data(){
      return {
        address: [],
        account:{
          name: '一把健',
          id:'',
          password: '123456',
          avatar: '',
          sex: '男',
          birthday: '1998年5月7',
          home: [],
          live: []
        }
      }
    },
    components:{
      upload,
      blogCard
    }
  }
</script>

<style scoped>
  .account-info
  {
    padding: 50px;
  }
  .account-info label
  {
    vertical-align:middle;
    display:inline-block;
    font: normal 16px/28px \5FAE\8F6F\96C5\9ED1, "Microsoft YaHei";
  }
  .account-group
  {
    margin-bottom: 20px;
  }
</style>
