<template>
  <div>
    <div class="smallCards">
      <ul>
        <li v-for="item in content">
          <Card :bordered="false" style="width:195px">
            <div style="text-align:center; padding: 0">
              <router-link class="card" :to="item.url">
                <img :src="item.cover" alt="">
                <em>
                  <span>{{item.title}}</span>
                </em>
              </router-link>
              <p>
                {{item.des1}}
                <br>
                {{item.des2}}
              <div class="small-bottom">
                <a href="javascript:void(0)">
                  <img :src="item.account1">
                </a>
                <a href="javascript:void(0)">
                  <img :src="item.account2">
                </a>
                <a href="javascript:void(0)">
                  <img :src="item.account3">
                </a>
                <a href="javascript:void(0)" title="更多">
                  <img src="..\\..\\..\\static\\img\\more.png">
                </a>
              </div>
            </div>
          </Card>
        </li>

      </ul>
    </div>

    <div class="smallCards">
      <ul>
        <li v-for="item in content2">
          <Card :bordered="false" style="width:195px">
            <div style="text-align:center; padding: 0">
              <router-link class="card" :to="item.url">
                <img :src="item.cover" alt="">
                <em>
                  <span>{{item.title}}</span>
                </em>
              </router-link>
              <p>
                {{item.des1}}
                <br>
                {{item.des2}}
              <div class="small-bottom">
                <a href="javascript:void(0)">
                  <img :src="item.account1">
                </a>
                <a href="javascript:void(0)">
                  <img :src="item.account2">
                </a>
                <a href="javascript:void(0)">
                  <img :src="item.account3">
                </a>
                <a href="javascript:void(0)" title="更多">
                  <img src="..\\..\\..\\static\\img\\more.png">
                </a>
              </div>
            </div>
          </Card>
        </li>

      </ul>
    </div>
  </div>

</template>

<script>
  export default {
    name: "smallCards",
    data() {
      return {
        content: [
          {
            title: '都市风情',
            des1: "有2727种旅游灵感等你发现",
            des2: '它们由559位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/都市风情'
          },
          {
            title: '沙漠',
            des1: "有437种沙漠灵感等你探索",
            des2: '它们由253位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/沙漠'
          },
          {
            title: '观鸟',
            des1: "有229种观鸟灵感等你探索",
            des2: '它们由142位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/观鸟'
          },
          {
            title: '休闲',
            des1: "有587种休闲客灵感等你探索",
            des2: '它们由289位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/休闲'
          },
          {
            title: '草原',
            des1: "有693种草原灵感等你探索",
            des2: '它们由328位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/草原'
          },
          {
            title: '骑行',
            des1: "有204种旅游灵感等你发现",
            des2: '由120位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/骑行'
          }
        ],
        content2:[
          {
            title: '邮轮',
            des1: "有288种邮轮灵感等你探索",
            des2: "它们由155位旅行家亲历整理",
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/邮轮'
          },
          {
            title: '古城古镇',
            des1: "有3320种旅游灵感等你发现",
            des2: "由802位旅行家亲历整理",
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/古城古镇'
          },
          {
            title: '徒步',
            des1: "有459种旅游灵感等你发现",
            des2: "由242位旅行家亲历整理",
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/徒步'
          },
          {
            title: '登山',
            des1: "有419种旅游灵感等你发现",
            des2: '它们由289位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/登山'
          },
          {
            title: '书店',
            des1: "有75种书店灵感等你发现",
            des2: '由59位旅行作家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/书店'
          },
          {
            title: '动物',
            des1: "有204种旅游灵感等你发现",
            des2: '由120位旅行家亲历整理',
            cover: '\\static\\img\\ocean.png',
            account1: '\\static\\img\\head.jpeg',
            account2: '\\static\\img\\head.jpeg',
            account3: '\\static\\img\\head.jpeg',
            url: '/blogList/动物'
          }
        ]
      };
    }
  }
</script>

<style scoped>

  .smallCards > ul {
    margin: 0 auto;
  }

  .smallCards li {

    padding-bottom: 40px;
    float: left;

    margin-right: 10px;

  }

  .smallCards li a.card {
    border-radius: 5px;
    width: 195px;
    height: 195px;
    overflow: hidden;
    position: relative;
    display: block;
  }

  .smallCards li em {
    width: 195px;
    height: 195px;
    position: absolute;
    top: 0;
    left: 0;
    display: block;
    font: 20px/30px 微软雅黑;
    text-align: center;
    color: #FFF;
    overflow: hidden;
    z-index: 2;
    background: rgba(0, 0, 0, 0.2);
  }

  .smallCards li p {
    font: 12px/20px 微软雅黑;
    color: #b7b7b7;
    padding: 10px 0;
    margin: 0 8px;
  }

  .smallCards li em span {
    padding-top: 90px;
    display: block;
  }

  .small-bottom {
    display: inline-block;
    padding: 0 15px 10px;
  }

  .small-bottom > a {
    position: relative;
    display: block;
    float: left;
    width: 30px;
    height: 30px;
    margin-right: 10px;
  }

  .small-bottom > a > img {
    border-radius: 100%;
    /* margin-right: 8px; */
    width: 30px;
    height: 30px;
  }

  .small-bottom > a > i {
    margin: 0 auto;
  }

</style>
