<template>
  <div class="normalCards">
    <ul>
      <li>
        <a class="card" href="javascript:void(0)">
          <img src="http://img1.lotour.net/Inspiration/2018/0826/20180826094029007335441_295.jpg" alt="">
          <em>
                <span>
                  埃塞哈莫族
                  <br>
                  奇葩成人礼
                </span>
          </em>
        </a>
        <h5>
          <a href="">
            哈莫族奇葩成人礼：男人裸体跳
          </a>
        </h5>
        <div class="normal-bottom">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2016/1116/20161116170327171635670_86.jpg" alt="">
          </a>
          <div>
            <a href="">友贞女</a>
            <p>《珠江商报》专栏作者、《中山日报》签</p>
          </div>
        </div>

      </li>
      <li>
        <a class="card" href="javascript:void(0)">
          <img src="http://img1.lotour.net/Inspiration/2018/0830/20180830105205655530151_295.jpg" alt="">
          <em>
                <span>
                  北京城最独特
                  <br>
                  “小众秘境”
                </span>
          </em>
        </a>
        <h5>
          <a href="">
            海坨山 | 骑行山林，总有刺
          </a>
        </h5>
        <div class="normal-bottom">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2016/1207/20161207094232337162552_86.jpg" alt="">
          </a>
          <div>
            <a href="">小乔帮主</a>
            <p>时尚达人，美搭潮人，微博签约自媒体，</p>
          </div>
        </div>

      </li>
      <li>
        <a class="card" href="javascript:void(0)">
          <img src="http://img1.lotour.net/Inspiration/2018/0829/20180829101927383361207_295.jpg" alt="">
          <em>
                <span>
                  路过济南
                  <br>
                  那一晚宁静灯火
                </span>
          </em>
        </a>
        <h5>
          <a href="">
            路过济南那一晚宁静灯火
          </a>
        </h5>
        <div class="normal-bottom">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2017/0617/20170617070530509376612_86.jpg " alt="">
          </a>
          <div>
            <a href="">寻影的人</a>
            <p>好的文章如一幅画，在画里面，你能看到</p>
          </div>
        </div>

      </li>
      <li>
        <a class="card" href="javascript:void(0)">
          <img src="http://img1.lotour.net/Inspiration/2018/0729/20180729190911252687430_295.jpg" alt="">
          <em>
                <span>
                  古代帝王的
                  <br>
                  曼妙情趣
                </span>
          </em>
        </a>
        <h5>
          <a href="">
            火山温泉、许家窑、汉墓长城，
          </a>
        </h5>
        <div class="normal-bottom">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2018/0814/20180814145520009213529_86.jpg" alt="">
          </a>
          <div>
            <a href="">尼玛次仁</a>
            <p>不惧风雨，始终面带和蔼地微笑，照亮一</p>
          </div>
        </div>

      </li>
    </ul>

  </div>

</template>

<script>
  export default {
    name: "normal-cards"
  }
</script>

<style scoped>
  .normalCards > ul > li {
    padding-bottom: 40px;
    float: left;
    height: 440px;
    margin-right: 10px;
  }

  .normalCards .card {
    width: 295px;
    height: 295px;
    overflow: hidden;
    position: relative;
    display: block;
  }

  .normalCards .card > img {
    width: 295px;
    height: 295px;
    border-radius: 5px;
  }

  .normalCards .card > em
  {
    transition: all 0.6s;
  }
  .normalCards .card > em:hover
  {
    transform: scale(1.2); /* 放大1.2倍 */
    background: rgba(0, 0, 0, 0);
  }

  .normalCards li em {
    width: 295px;
    height: 295px;
    position: absolute;
    top: 0;
    left: 0;
    display: block;
    font: 21px/29px 微软雅黑;
    text-align: center;
    color: #FFF;
    overflow: hidden;
    z-index: 2;
    background: rgba(0, 0, 0, 0.2);
  }

  .normalCards li em span {
    padding-top: 118px;
    display: block
  }

  .normalCards li > h5 {
    text-align: center;
  }

  .normalCards li > h5 > a {
    color: #555;
    font: 18px/40px \5FAE\8F6F\96C5\9ED1, "Microsoft YaHei";
    vertical-align: middle;
    margin-top: 3px;
  }

  .normalCards li > h5 > a:hover {
    color: #f74133;
  }

  .normalCards .normal-bottom {
    width: 200px;
    border-top: 1px solid #e7e7e7;
    padding: 12px 0 0 17px;
    margin-top: 5px;
  }

  .normalCards .normal-bottom>a {
    position: relative;
    display: block;
    float: left;
    width: 30px;
    height: 30px;
    margin-right: 6px;
  }

  .normalCards .normal-bottom a > img {
    float: left;
    width: 30px;
    height: 30px;
    border-radius: 100%;
  }

  .normalCards .normal-bottom > div {
    float: right;
    width: 135px;
  }

  .normalCards .normal-bottom > div > a {
    display: block;
    font: 12px/19px '微软雅黑';
    color: #818181;
  }

  .normalCards .normal-bottom > div > a:hover {
    color: #f74133;
  }
  .normalCards .normal-bottom > div > p
  {
    font: 12px/19px '微软雅黑';
    color: #b7b7b7;
  }


</style>
