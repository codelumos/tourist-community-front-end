<template>
  <div class="comment-component" v-if="accountInfo">
    <div id="postcomment">
      <h4>提交评论</h4>
      <p></p>
      <Input type="textarea" v-model="myReply[0].contentEx" :rows="4" placeholder="请输入您要评论的内容"/>
      <Button type="default" long @click="publish()">发表</Button>
    </div>
    <div id="getcomment">
      <h4>评论列表</h4>
      <p></p>
      <div class="comment" v-for="(comment,index) in comments">
        <div class="title">
          <Divider>
            <span>{{index+1}}楼: </span>
            <span><img :src="comment.imagePath" alt=""></span>
            <span>{{comment.userName}}:</span>
          </Divider>

        </div>
        <div class="content">
          <div>
            <p v-text="comment.contentEx">

            </p>
          </div>

        </div>
        <div class="foot">
          <span>{{date(comment.time)}}</span>
        </div>
      </div>

    </div>
  </div>
</template>

<script>
  import Moment from 'moment';
  import common from '../../common/common';

  import $ from 'jquery';

  import {mapState} from 'vuex'

  export default {
    name: "comment",
    props: ['id'],
    data() {
      return {
        comments: [],
        myReply: [
          {
            appointmentId: this.id,
            authorId: '',
            imagePath: '',
            userName: '',
            contentEx: '',
            replyId: 0,
            time: '',
          }
        ]


      };
    },
    methods:{
      initComment(){

        var url = common.apidomain + "/appointments?appointmentId=" + this.id;
        var that = this;
        this.$http.get(url).then(function (response) {
          var data = response.data;
          if (data.status === 0) {
            that.comments = data.message.appointmentReplyUps;

          } else {
            that.$Message.warning({
              content: data.message,
              duration: 5
            });
          }
        });
      },
      publish(){

        if(this.myReply[0].contentEx.trim().length > 0){
          var url = common.apidomain + "/appointmentReplies";
          var that = this;
          this.myReply[0].time = new Date();

          this.$http.post(url,this.myReply[0]).then(function (response) {
            var data = response.data;

            if(data.status === 0){
              // 将最新的评论数据追加到评论列表的最顶部
              that.myReply[0].replyId = data.message.replyId;
              var comment = $.extend(true, [], that.myReply);
              that.comments = comment.concat(that.comments);

              // 将文本框中的评论内容清空
              that.myReply[0].contentEx = "";

              that.$Message.success({
                content: "评论成功",
                duration: 5
              });
            }else{
              that.$Message.warning({
                content: data.message,
                duration: 5
              });
            }
          }).catch(function (error) {
            that.$Message.warning({
              content: error,
              duration: 5
            });
          });
        }else{
          this.$Message.success({
            content: "请输入评论",
            duration: 5
          });
        }

      }
    },
    created(){
      // 防止未登录导致的null异常
      if(this.accountInfo){
        this.myReply.authorId = this.accountInfo.userId;
        this.myReply.imagePath = this.accountInfo.imagePath;
        this.myReply.userName = this.accountInfo.userName;
        this.initComment();
      }

    },
    computed:{
      date() {
        return function (input) {
          return Moment(Date.parse(input)).format("YYYY-MM-DD");
        }
      },
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      })
    }
  }
</script>

<style scoped>
  .comment {
    /*border: 1px solid #adadad;*/
    border-radius: 5px;
    padding-bottom: 20px;
  }

  .title span {
    color: #adadad;

  }

  .title img {
    width: 36px;
    height: 36px;
    border-radius: 100%;
  }

  .foot span {
    float: right;
  }

  .content p {
    text-align: center;
  }
</style>
