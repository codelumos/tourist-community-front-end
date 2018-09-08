<template>
  <!--==S 左侧 -->
  <Affix :offset-top="50">
    <div class="writer-desc">
      <div class="clearfix">
        <a title="" target="_blank" href="#">
          <div class="author-title">
            <img class="author-avatar" height="60" width="60" alt=""
                 src="http://img1.lotour.net/inspiration/2017/0103/2017010323403404744278_86.jpg"/>
          </div>
          <span><a href="#" target="_blank" title="">南麂土著</a></span>
          <div class="read">
            <img src="http://img1.lotour.net/inspiration/dingyue/dy+.png" class="dy_pic"/><i class="dy">订阅</i>
          </div>
        </a>

      </div>
      <div class="writer-signature">
        <p>把旅行当做修炼，将发现视为起点，山水做画框，故事来润色，每一段旅行，都想站成一道风景，每一次经历，都想写成传奇。</p>
      </div>

      <a href="http://zhuanlan.lotour.com/163/" class="arrow"></a>
    </div>
  </Affix>

  <!--==E 左侧 -->


</template>

<script>
  export default {
    name: "userDesc"
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
