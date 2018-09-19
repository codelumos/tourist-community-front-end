<template>
      <div class="board">
          <img class="background" :src="blog.coverPath">
          <h1>{{blog.title}}</h1>
          <div class="article-des">
            <span><Icon type="ios-pin" />{{blog.sp}}.{{blog.spotName}}</span>
            <span><Icon type="ios-heart" />&nbsp;{{blog.likes}}&nbsp;</span>
            <span><Icon type="md-eye" />&nbsp;{{blog.readers}}</span>
          </div>
      </div>
</template>

<script>

    export default {
        name: "board",
        props: ['blog']

    }
</script>

<style scoped>
  .board
  {
    width: 100%;
    height: 440px;
    margin-bottom: 50px;
  }
  img
  {
    height: 100%;
    width: 100%;
    object-fit: cover;
    object-position: top;
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
