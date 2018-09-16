<template>
  <div class="launchCard">
    <Col span="14" offset="2">
    <div>
      <h2 style="float: left">发起拼途</h2>
    </div>
    <br>
    <br/>
    <hr/>
    <br/>
    <Card style="width: 100%;margin-bottom: 40px">
      <div class="card-content">
        <Form :model="appointment" :label-width="80">
          <FormItem label="主题:">
            <Input placeholder="输入醒目的主题" v-model="appointment.title"/>
          </FormItem>
          <FormItem label="人数限制">
            <Row>
              <Col span="11">
              <Input placeholder="输入本团人数上限" v-model="appointment.sum" number/>
              </Col>
              <Col span="2" style="text-align: center">
              截止日期：</Col>
              <Col span="11">
              <DatePicker type="date" :options="options" placement="bottom-end" placeholder="Select date"
                          style="width: 100%;" v-model="appointment.time"></DatePicker>
              </Col>
            </Row>
          </FormItem>
          <FormItem label="旅游目的地">
            <Row>
              <Col span="8">
              <AutoComplete
                v-model="address.lp"
                :data="address.lpArr"
                @on-search="searchLp"
                placeholder="大地点（国内：省份；国外：国家）"></AutoComplete>
              </Col>
              <Col span="6" offset="2">
              <AutoComplete
                v-model="address.sp"
                :data="address.spArr"
                @on-search="searchSp"
                placeholder="小地点（市区）"></AutoComplete>
              </Col>
              <Col span="6" offset="2">
              <AutoComplete
                v-model="address.spot"
                :data="address.spotArr"
                @on-search="searchSpot"
                placeholder="景点"></AutoComplete>
              </Col>
            </Row>
          </FormItem>
          <FormItem label="内容">
            <Input v-model="appointment.content" type="textarea" :autosize="{minRows: 2,maxRows: 4}"
                   placeholder="输入简短的拼途内容，让人一眼认定你"/>
          </FormItem>
          <FormItem
            v-for="(item, index) in tags"
            v-if="item.status"
            :key="index"
            :label="'标签 ' + item.index">
            <Row>
              <Col span="19">
              <Input type="text" v-model="item.value" placeholder="输入标签名，让人更快找到你"/>
              </Col>
              <Col span="4" offset="1">
              <Button @click="handleRemove(index)">删除</Button>
              </Col>
            </Row>
          </FormItem>
          <FormItem>
            <Row>
              <Col span="12">
              <Button class="tagAdd" type="dashed" @click="addTag()" icon="md-add">添加标签</Button>
              </Col>
            </Row>
          </FormItem>
          <FormItem label="拼途图片">
            <Upload
              multiple
              type="drag"
              :format="['jpg','jpeg','png']"
              :on-format-error="handleFormatError"
              action="//jsonplaceholder.typicode.com/posts/">
              <div style="padding: 20px 0">
                <Icon type="ios-cloud-upload" size="52" style="color: #3399ff"></Icon>
                <p>上传图片让你的拼途更丰富多彩</p>
              </div>
            </Upload>
          </FormItem>
        </Form>
        <Divider/>

        <Button type="primary" long @click="launch()">发表</Button>
      </div>
    </Card>
    </Col>
  </div>
</template>

<script>
  import $ from 'jquery';

  export default {
    name: "launch-card",
    data() {
      return {
        appointment: {
          title: '',
          sum: '',
          time: '',
          content: '',
          tag1: '',
          tag2: '',
          tag3: ''
        },
        index: 1,
        tags: [
          {
            value: '',
            index: 1,
            status: 1
          }
        ],
        // 当前日期之前的日期禁止
        options: {
          disabledDate(date) {
            return date && date.valueOf() < Date.now() - 86400000;
          }
        },
        address: {
          lp: "",
          sp: "",
          spot: "",
          lpArr: [],
          spArr: [],
          spotArr: []
        },


      }
    },
    methods: {
      launch() {

        switch (this.tags.length) {
          case 1:
            this.appointment.tag1 = this.tags[0].value;
            break;
          case 2:
            this.appointment.tag1 = this.tags[0].value;
            this.appointment.tag2 = this.tags[1].value;
            break;
          case 3:
            this.appointment.tag1 = this.tags[0].value;
            this.appointment.tag2 = this.tags[1].value;
            this.appointment.tag3 = this.tags[2].value;
            break;
          default:
            break;
        }
      },
      addTag() {
        if (this.index >= 2) {
          $(".tagAdd").css("display", "none");
        }
        this.index++;
        this.tags.push({
          value: '',
          index: this.index,
          status: 1
        });
      },
      handleRemove(index) {
        this.index--;
        if (this.index < 3) {
          $(".tagAdd").css("display", "block");
        }
        this.tags.splice(index, 1);
      },
      handleFormatError(file){
        this.$Notice.warning({
          title: '文件格式错误！',
          desc: '文件： ' + file.name + '的文件格式错误, 请上传jpg，png，jpeg。'
        });
      },
      searchLp(value){
        this.address.lpArr = !value ? [] : [
          value,
          value + value,
          value + value + value
        ];
      },
      searchSp(value){
        this.address.spArr = !value ? [] : [
          value,
          value + value,
          value + value + value
        ];
      },
      searchSpot(value){
        this.address.spotArr = !value ? [] : [
          value,
          value + value,
          value + value + value
        ];
      }
    }
  }
</script>

<style scoped>
  .launchCard {
    min-height: 500px;
  }

  .card-content {
    padding: 16px;
  }

  a {
    color: #17233d;
    text-decoration: none
  }

  a:hover {
    color: #2d8cf0
  }

  .card-content label {
    font-size: 15px;
    line-height: 35px;
  }

</style>
