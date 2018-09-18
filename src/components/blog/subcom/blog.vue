<template>
  <div class="blog-text">
    <div v-html="blog?blog.contentEx:''"></div>
  </div>

</template>

<script>

  import $ from "jquery";

  export default {
    name: "blog",
    props: ['blog'],
    methods:{

    },

    mounted(){
      var imgArr = $(".blog-text img");

      for(var i = 0;i < imgArr.length;i++){
        if(imgArr[i].alt.length != 0 && imgArr[i].alt.indexOf("http://") >= 0){
          imgArr[i].src = imgArr[i].alt;
        }

      }
    }

  }
</script>

<style scoped>
  .blog-text {
    /*float: right;*/
    display: inline-block;
    min-height: 600px;
  }

  img {
    width: 100%;
    border-radius: 4px;
  }

  p {
    margin: 20px 0 0;
    font: normal 16px/28px \5FAE\8F6F\96C5\9ED1, "Microsoft YaHei";
    color: #333;
    text-align: left;
  }

  /*图片描述语言*/
  p.img-tip {
    position: relative;
    font-size: 14px;
    font-style: italic;
    line-height: 20px;
    color: #999;
    margin-top: 5px;
    text-align: left;
  }

  h2 {
    margin: 35px 0 18px;
    padding-left: 12px;
    background: url(http://img1.lotour.net/i-article/txt-tit.png) no-repeat 0 center;
    font-weight: bold;
  }
</style>
