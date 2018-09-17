<template>
  <!--==S 左侧 -->
  <Affix :offset-top="50">
    <div class="writer-desc">
      <div class="clearfix">
        <a title="" target="_blank" href="#">
          <div class="author-title">
            <img class="author-avatar" height="60" width="60" alt=""
                 :src="author.imagePath"/>
          </div>
          <span><router-link v-bind="{to:'/otherAccount/'+author.userId}" target="_blank" title="">{{author.userName}}</router-link></span>
          <div class="read">
            <img src="http://img1.lotour.net/inspiration/dingyue/dy+.png" class="dy_pic"/><i class="dy">订阅</i>
          </div>
        </a>

      </div>
      <div class="writer-signature">
        <p v-text="author.description"></p>
      </div>

      <a href="http://zhuanlan.lotour.com/163/" class="arrow"></a>
    </div>
  </Affix>

  <!--==E 左侧 -->


</template>

<script>
  import common from '../../../common/common';

  export default {
    name: "userDesc",
    props:['id'],
    data(){
      return {
        author: {}
      };
    },
    methods:{
      initAuthor(){

        var url  = common.apidomain + "/accounts?userId=" + this.id;
        var that = this;
        this.$http.get(url).then(function (response) {
            var data = response.data;
            if(data.status === 1){
              that.author = data.message;

            }
        })
      }
    },
    created(){

      this.initAuthor();

    }
  }
</script>

<style scoped>

  .writer-desc {
    float: left;
    display: inline-block;
    width: 100%;
    background: #fff;
    border-radius: 5px;
    border: 1px solid #eee;
    padding: 10px;
    position: absolute;
    overflow: hidden;
  }
  .author-title
  {
    position: relative;
    float: left;
  }
  .writer-desc span
  {
    display: inline-block;
    margin: 3px 0 0 20px;
  }
  .writer-desc span>a
  {
    color: #2b2b2b;
    font: 16px/20px \5FAE\8F6F\96C5\9ED1,"Microsoft YaHei";
  }
  .writer-desc span>a:hover
  {
    color: #f74133;
  }
  .author-avatar
  {
    border-radius: 100%;
  }
  .read
  {
    margin-top: 15px;
    display: block;
    width: 110px;
    text-align: right;
  }
  .writer-signature
  {
    margin-top: 10px;
  }
  .writer-signature>p
  {
    padding-top: 5px;
    font: 12px/24px \5FAE\8F6F\96C5\9ED1,"Microsoft YaHei";
    color: #666;
    text-align: justify;
    text-justify: inter-ideograph;
    overflow: hidden;
  }

</style>
