<template>
  <div class="bigCards">
    <ul>
      <li v-for="item in content">
        <router-link :to="item.url">
          <img :src="item.cover" alt="">
          <em>
            <span>
              {{item.cover_title1}}
              <br>
              {{item.cover_title2}}
            </span>
          </em>
        </router-link>
        <h5>
          <router-link :to="item.url">
            {{item.title}}
          </router-link>
        </h5>
        <div class="big-bottom">
          {{item.author}}
        </div>
      </li>

    </ul>
  </div>
</template>

<script>
    export default {
        name: "big-cards",
      data(){
          return {
            content: [
              {
                title: '在长滩岛感受梦幻的白沙滩',
                cover_title1: '全世界最梦幻的',
                cover_title2: '白沙滩',
                author: '月关',
                cover: 'http://img1.lotour.net/Inspiration/2016/0612/20160612120804837751324_600.jpg',
                url: '/blog/31'
              },
              {
                title: '石梯坪，北回海岸线，遥望大海的另一边',
                cover_title1: '北回海岸线',
                cover_title2: '大海另一边',
                author: '月关',
                cover: 'http://img1.lotour.net/Inspiration/2018/0916/20180916225137640598247_600.jpg',
                url: '/blog/32'
              }
            ],
          };
      }
    }
</script>

<style scoped>
  .bigCards
  {
    float: left;
    width: 100%;
    position: relative;
    margin-bottom: 55px;
  }
  .bigCards li
  {
    width: 46%;
    display: inline-block;
    margin-right: 16px;
  }
  .bigCards li>a{
    width: 100%;
    height: 295px;
    overflow: hidden;
    position: relative;
    display: block;
    border-radius: 5px;
  }
  .bigCards li>a
  {
    display: block;

    transition: all 0.6s;
  }
  .bigCards li>a:hover
  {
    box-shadow: 3px 3px 3px #888888;
  }
  .bigCards li>a>em
  {
    width: 100%;
    height: 295px;
    position: absolute;
    top: 0;
    left: 0;
    display: block;
    font: 21px/29px 微软雅黑;
    text-align: center;
    color: #FFF;
    overflow: hidden;
    background: rgba(0,0,0,0.2);
    transition: all 0.6s;
  }
  .bigCards li>a>em:hover
  {
    background: rgba(0,0,0,0);
  }

  .bigCards li>a>em>span
  {
    color: #fff;
    padding-top: 105px;
    display: block;
  }

  .bigCards li>h5
  {

    font: 18px/40px \5FAE\8F6F\96C5\9ED1,"Microsoft YaHei";
    vertical-align: middle;
    margin-top: 3px;
  }
  .bigCards li>h5>a
  {
    color: #333;
  }

  .bigCards li>h5>a:hover
  {
    color: #f74133;
  }

</style>
