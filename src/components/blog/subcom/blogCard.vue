<template>
  <div class="blogCard">
    <Card class="card">
      <div class="cardContent">
        <div class="blogAuthor">
          <div>
            <a href="javascript:void(0)">
            <img class="author-avatar" alt=""
                    src="http://img1.lotour.net/Inspiration/2015/1204/20151204213355229789732_310.jpg "/>
            </a>
          </div>
          <div class="author-name">
            <router-link to="/otherAccount" target="_blank">
              <span>善良酱</span>
            </router-link>
            <span>
              <Icon type="md-eye" />浏览量: 112
            </span>
            <div class="author_signature">
              <span>
                    乐途，搜狐，QQ公众号，企鹅号，头条等平台自媒体。
              </span>
            </div>

          </div>

        </div>
        <div class="blog">
          <a class="place" href="#">皇帝岛</a>
          <div class="blog_cover">
            <router-link to="/account">
              <img src="http://img1.lotour.net/Inspiration/2018/0831/20180831174017564538425_910_500.jpg" alt="">
              <p class="title">潜水，人生中值得去挑战一次。不为征服，只为挑战，不为逞能，只为突破。</p>
            </router-link>

          </div>

        </div>
      </div>
    </Card>
    <Card class="card">
      <div class="cardContent">
        <div class="blogAuthor">
          <div>
            <a href="javascript:void(0)">
              <img class="author-avatar" alt=""
                   src="http://img1.lotour.net/Inspiration/2016/0412/20160412112439027165115_310.jpg  "/>
            </a>
          </div>
          <div class="author-name">
            <a href="javascript:void(0)">
              <span>老黄带你去旅游</span>
            </a>
            <span>
              <Icon type="md-eye" />浏览量: 112
            </span>
            <div class="author_signature">
              <span>
                    乐途，搜狐，QQ公众号，企鹅号，头条等平台自媒体。
              </span>
            </div>

          </div>

        </div>
        <div class="blog">
          <a class="place" href="#">考山路</a>
          <div class="blog_cover">
            <a href="">
              <img src="http://img1.lotour.net/Inspiration/2018/0831/20180831170954341346926_910_500.jpg" alt="">
              <p class="title">考山路的国际夜生活，全球背包客聚集地，</p>
            </a>

          </div>

        </div>
      </div>
    </Card>
  </div>

</template>

<script>
  export default {
    name: 'blogCard'
  }
</script>

<style scoped>
  .blogCard
  {
    margin-bottom: 20px;
    padding-bottom: 10px;
  }
  .card
  {
    min-width: 970px;
    width: 100%;
    height: 485px;
    overflow: hidden;
    margin-top: 50px;
    padding: 5px;
  }
  .blogAuthor
  {
    float: left;
    display: inline-block;
    width: 265px;
    padding: 10px;
    height: 445px;
    border-right: 1px solid #eee;
  }
  .blogAuthor>.author-name
  {
    font-size: 20px;

    line-height: 52px;
    text-align: center;
  }
  .blogAuthor>.author-name>a
  {
    color: #666666;
  }
  .blogAuthor>.author-name>a:hover
  {
    color: #f74133;
  }
  .author-avatar
  {
    border-radius: 100%;
    height: 106px;
    width: 106px;
    margin: 40px 0px 0px 70px;
  }
  .blogAuthor>.author-name>span
  {
    display: block;
    font: 14px/20px "Microsoft YaHei";
    color: #b8b8b8;
    margin-bottom: 10px;
  }
  .author_signature>span
  {
    font-size: 14px;
    color: #999999;
    margin-top: 15px;
    line-height: 18px;
    text-align: center;
    display: block;
  }
  .blog
  {
    height: 450px;
    border-radius: 5px;
    display: inline-block;
    width: 100px;
    margin-left: 60px;
  }
  .blog_cover
  {
    position: relative;
    width: 900px;
    height: 400px;
  }
  .blog img
  {
    height: 100%;
    width: 100%;
    border-radius: 5px;
  }
  .blog p.title
  {
    position: absolute;
    left: 0;
    top: 0;
    color: #fff;
    font-size: 18px;
    text-shadow: 0 0 10px rgba(0, 0, 0, 0.65);
    display: block;
    width: 100%;
    height: 74px;
    line-height: 45px;
    text-indent: 16px;
  }
  .blog>a.place
  {
    display: inline-block;
    font-size: 20px;
    height: 58px;
    line-height: 62px;
    color: #666666;

    text-indent: 17px;
  }
  .blog>a.place:hover
  {
    color: #f74133;
  }

</style>
