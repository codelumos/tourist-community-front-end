<template>
  <div class="blogCard">
    <Card class="card" v-for="(article,index) in articles.articles" :key="article.articleId">
      <div class="cardContent">
        <div class="blogAuthor">
          <div>
            <router-link target="_blank" v-bind="{to: '/otherAccount'+ articles.accountUps[index].userId}">
            <img class="author-avatar" alt=""
                    :src="articles.accountUps[index].imagePath"/>
            </router-link>
          </div>
          <div class="author-name">
            <router-link v-bind="{to: '/otherAccount'+ articles.accountUps[index].userId}" target="_blank">
              <span>{{articles.accountUps[index].userName}}</span>
            </router-link>
            <span>
              <Icon type="md-eye" />浏览量: {{article.readers}}
            </span>
            <div class="author_signature">
              <span>
                    {{articles.accountUps[index].description}}
              </span>
            </div>

          </div>

        </div>
        <div class="blog">
          <router-link class="place" v-bind="{to: '/blog/'+ article.articleId}" >{{article.spotName}}</router-link>
          <div class="blog_cover">
            <router-link v-bind="{to: '/blog/'+ article.articleId}">
              <img :src="article.coverPath" alt="">
              <p class="title">{{article.title}}</p>
            </router-link>

          </div>

        </div>
      </div>
    </Card>
    <div class="eception" v-if="articles.length === 0">
      这人很懒，还没写啥博客....
    </div>
  </div>

</template>

<script>
  export default {
    name: 'blogCard',
    props: ['articles'],
    methods:{

    },
    created(){

    }
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
    object-fit: cover;
    object-position: top;
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
  .eception{
    font-size: 30px;
    text-align: center;
    font-weight: bold;
    margin-top: 120px;
  }

</style>
