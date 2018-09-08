<template>
    <div>
      <div class="board">
          <img class="background" src="http://img1.lotour.net/Inspiration/2018/0826/20180826104627552461257_1920.jpg">
          <h1>世界上最浪漫的梯田，专供沐浴不耕作</h1>
          <div class="article-des">
            <span><Icon type="ios-pin" />北京.奥伦达部落</span>
            <span><Icon type="ios-heart" />&nbsp;17&nbsp;</span>
            <span><Icon type="md-eye" />&nbsp;288</span>
          </div>
      </div>
    </div>
</template>

<script>
    import $ from 'jquery';

    export default {
        name: "board",
        created(){
          $(".background").width($(window).width());
        }
    }
</script>

<style scoped>
  .board
  {
    width: 100%;
  }
  img
  {
    position: relative;
    left: -116px;
  }
  .board h1
  {
    text-align: center;
    font: normal 40px/40px \5FAE\8F6F\96C5\9ED1,"Microsoft YaHei";
    color: #fff;
    position: relative;
    width: 100%;

    bottom: 185px;
  }
  .article-des
  {
    text-align: center;
    font: normal 16px \5FAE\8F6F\96C5\9ED1,"Microsoft YaHei";
    color: #fff;
    position: relative;
    width: 100%;
    bottom: 90px;
  }
  .article-des span
  {
    margin-right: 10px;
  }
</style>
