<template>
  <div class="comment-component">
    <div id="postcomment">
      <h4>提交评论</h4>
      <p></p>
      <Input type="textarea" :rows="4" placeholder="请输入您要评论的内容"/>
      <Button type="default" long>发表</Button>
    </div>
    <div id="getcomment">
      <h4>评论列表</h4>
      <p></p>
      <div class="comment">
        <div class="title">
          <Divider>
            <span>1楼: </span>
            <span><img src="../../../static/img/黑子.jpg" alt=""></span>
            <span>一把健:</span>
          </Divider>

        </div>
        <div class="content">
          <div>
            <p>
              我去！我不去！
            </p>
          </div>

        </div>
        <div class="foot">
          <span>2020-10-1</span>
        </div>
      </div>
      <div class="comment">
        <div class="title">
          <Divider>
            <span>2楼: </span>
            <span><img src="../../../static/img/黑子.jpg" alt=""></span>
            <span>一把健:</span>
          </Divider>
        </div>
        <div class="content">
          <div>
            <p>
              好像很厉害的样子
            </p>

          </div>
        </div>
        <div class="foot">
          <span>2020-10-1</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "comment",
    data() {
      return {};
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
