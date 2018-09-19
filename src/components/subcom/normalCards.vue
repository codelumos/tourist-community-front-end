<template>
  <div>
    <div class="normalCards">
      <ul>
        <li v-for="item in content" :key="item.id">
          <router-link class="card" :to="item.url">
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
            <a href="">
              {{item.title}}
            </a>
          </h5>
          <div class="normal-bottom">
            <a href="">
              <img :src="item.avatar" alt="">
            </a>
            <div>
              <a href="">{{item.author}}</a>
              <p>{{item.des}}</p>
            </div>
          </div>

        </li>
      </ul>

    </div>

    <div class="normalCards">
      <ul>
        <li v-for="item in content2" :key="item.id">
          <a class="card" href="javascript:void(0)">
            <img :src="item.cover" alt="">
            <em>
                <span>
                  {{item.cover_title1}}
                  <br>
                  {{item.cover_title2}}
                </span>
            </em>
          </a>
          <h5>
            <a href="">
              {{item.title}}
            </a>
          </h5>
          <div class="normal-bottom">
            <a href="">
              <img :src="item.avatar" alt="">
            </a>
            <div>
              <a href="">{{item.author}}</a>
              <p>{{item.des}}</p>
            </div>
          </div>

        </li>
      </ul>

    </div>
  </div>


</template>

<script>
  export default {
    name: "normal-cards",
    data(){
      return {
        content: [
          {
            id: 1,
            title: '哈莫族奇葩成人礼：男人裸体跳',
            cover_title1:'埃塞哈莫族',
            cover_title2:'奇葩成人礼',
            author: '友贞女',
            avatar: 'http://img1.lotour.net/Inspiration/2016/1116/20161116170327171635670_86.jpg',
            des: '《珠江商报》专栏作者、《中山日报》签',
            cover: 'http://img1.lotour.net/Inspiration/2018/0826/20180826094029007335441_295.jpg',
            url: ''
          },
          {
            id: 2,
            title: '海坨山 | 骑行山林，总有刺',
            cover_title1:'北京城最独特',
            cover_title2:'“小众秘境”',
            author: '小乔帮主',
            avatar: 'http://img1.lotour.net/Inspiration/2016/1207/20161207094232337162552_86.jpg',
            des: '时尚达人，美搭潮人，微博签约自媒体，',
            cover: 'http://img1.lotour.net/Inspiration/2018/0830/20180830105205655530151_295.jpg',
            url: '/blog/29'
          },
          {
            id: 3,
            title: '路过济南那一晚宁静灯火',
            cover_title1:'路过济南',
            cover_title2:'那一晚宁静灯火',
            author: '寻影的人',
            avatar: 'http://img1.lotour.net/Inspiration/2017/0617/20170617070530509376612_86.jpg',
            des: '好的文章如一幅画，在画里面，你能看到',
            cover: 'http://img1.lotour.net/Inspiration/2018/0829/20180829101927383361207_295.jpg',
            url: '/blog/30'
          },
          {
            id: 4,
            title: '火山温泉、许家窑、汉墓长城，',
            cover_title1:'勿忘九一八',
            cover_title2:'传承抗联精神',
            author: '尼玛次仁',
            avatar: 'http://img1.lotour.net/Inspiration/2018/0814/20180814145520009213529_86.jpg',
            des: '不惧风雨，始终面带和蔼地微笑，照亮一',
            cover: 'http://img1.lotour.net/Inspiration/2018/0729/20180729190911252687430_295.jpg',
            url: ''
          },
        ],
        content2:[
          {
            id: 5,
            title: '勿忘九一八 传承抗联精神',
            cover_title1:'古代帝王的',
            cover_title2:'曼妙情趣',
            author: '一把健',
            avatar: 'http://img1.lotour.net/Inspiration/2016/0725/20160725130403960192332_86.jpg',
            des: '乐途专栏作者、旅游线路规划师',
            cover: 'http://img1.lotour.net/Inspiration/2018/0917/20180917205502043691746_295.jpg',
            url: ''
          },
          {
            id: 6,
            title: '红梨村｜邂逅一场原汁原味',
            cover_title1:'红梨村',
            cover_title2:'土味儿乡村行',
            author: 'strongL',
            avatar: 'http://img1.lotour.net/Inspiration/2016/0223/20160223134512594710818_86.jpg',
            des: '乐途专栏作者、旅游线路规划师',
            cover: 'http://img1.lotour.net/Inspiration/2018/0913/20180913235026118413083_295.jpg',
            url: ''
          },
          {
            id: 7,
            title: '奇峰仙境圣莲山',
            cover_title1:'北京小众圣地',
            cover_title2:'圣莲山',
            author: '英子',
            avatar: 'http://img1.lotour.net/Inspiration/2016/0926/20160926181150063615482_86.JPG ',
            des: '喜欢旅游、喜欢将旅途上的故事通过镜头',
            cover: 'http://img1.lotour.net/Inspiration/2018/0918/20180918100838394480397_295.jpg',
            url: ''
          },
          {
            id: 8,
            title: '《三生三世十里桃花》取景竟在',
            cover_title1:'网红仙境取景地',
            cover_title2:'恩施大峡谷',
            author: '如画心语',
            avatar: 'http://img1.lotour.net/Inspiration/2018/0803/20180803164916099344218_86.jpg',
            des: '中国艺术摄影家协会会员，自由撰稿人，',
            cover: 'http://img1.lotour.net/Inspiration/2018/0917/20180917225257046399479_295.jpg',
            url: ''
          }
        ]

      };
    }
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
