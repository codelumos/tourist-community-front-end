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
              <Input placeholder="用户名" v-model="account.name" />
              </Col>
              <Col span="1" offset="3">
              <label>密码：</label>
              </Col>
              <Col span="4">
              <Input type="password" placeholder="密码" />
              </Col>
            </Row>
            <Row class="account-group">
              <Col span="1" offset="6">
              <label>性别：</label>
              </Col>
              <Col span="4">
              <Select v-model="account.sex">
                <Option value="男">男</Option>
                <Option value="女">女</Option>
              </Select>
              </Col>
              <Col span="1" offset="3">
              <label>生日：</label>
              </Col>
              <Col span="4">
              <Input type="date" placeholder="生日"  v-model="account.birthday"/>
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
