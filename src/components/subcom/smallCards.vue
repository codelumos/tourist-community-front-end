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
                  <img src="http://img1.lotour.com/2016/index/arcmore.png">
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
                  <img src="http://img1.lotour.com/2016/index/arcmore.png">
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
            cover: 'http://img4.lotour.net/bcef/theme//2016/0901/2016090109324617353019.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/0906/20170906171800781742083_86.JPG',
            account3: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2016/1209/20161209115009462108991_86.jpg',
            url: '/blogList/都市风情'
          },
          {
            title: '沙漠',
            des1: "有437种沙漠灵感等你探索",
            des2: '它们由253位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0825/2016082516485763205363.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2018/0325/20180325013518029521474_86.jpg',
            url: '/blogList/沙漠'
          },
          {
            title: '观鸟',
            des1: "有229种观鸟灵感等你探索",
            des2: '它们由142位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0825/2016082517055213724118.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/1205/20171205203715412713363_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2016/1209/20161209115009462108991_86.jpg',
            url: '/blogList/观鸟'
          },
          {
            title: '休闲',
            des1: "有587种休闲客灵感等你探索",
            des2: '它们由289位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0918/2016091816385852997376.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2018/0910/20180910212357736466961_86.jpg',
            url: '/blogList/休闲'
          },
          {
            title: '草原',
            des1: "有693种草原灵感等你探索",
            des2: '它们由328位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0614/201606141902515063835.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2017/0104/20170104095912047856349_86.jpg',
            url: '/blogList/草原'
          },
          {
            title: '骑行',
            des1: "有204种旅游灵感等你发现",
            des2: '由120位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0614/2016061419234531191869.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2016/1207/20161207094232337162552_86.jpg',
            url: '/blogList/骑行'
          }
        ],
        content2:[
          {
            title: '邮轮',
            des1: "有288种邮轮灵感等你探索",
            des2: "它们由155位旅行家亲历整理",
            cover: 'http://img4.lotour.net/bcef/theme//2016/0603/2016060315184688343274.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2016/1209/20161209115009462108991_86.jpg',
            url: '/blogList/邮轮'
          },
          {
            title: '古城古镇',
            des1: "有3320种旅游灵感等你发现",
            des2: "由802位旅行家亲历整理",
            cover: 'http://img4.lotour.net/bcef/theme//2016/0603/2016060315291029267857.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2017/0316/20170316164733378572036_86.jpg',
            url: '/blogList/古城古镇'
          },
          {
            title: '徒步',
            des1: "有459种旅游灵感等你发现",
            des2: "由242位旅行家亲历整理",
            cover: 'http://img4.lotour.net/bcef/theme//2016/0825/2016082516465424787306.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2016/1209/20161209115009462108991_86.jpg',
            url: '/blogList/徒步'
          },
          {
            title: '登山',
            des1: "有419种旅游灵感等你发现",
            des2: '它们由289位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0614/201606141924048639486.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2016/0922/2016092209212553227364_86.JPG',
            url: '/blogList/登山'
          },
          {
            title: '书店',
            des1: "有75种书店灵感等你发现",
            des2: '由59位旅行作家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0825/201608251709067456150.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2015/1014/2015101421523394869232_86.jpg',
            url: '/blogList/书店'
          },
          {
            title: '动物',
            des1: "有204种旅游灵感等你发现",
            des2: '由120位旅行家亲历整理',
            cover: 'http://img4.lotour.net/bcef/theme//2016/0614/2016061419065831900480.jpg',
            account3: 'http://img1.lotour.net/Inspiration/2017/1218/20171218125918295975762_86.jpg',
            account2: 'http://img1.lotour.net/Inspiration/2017/0306/20170306171529362359192_86.jpg',
            account1: 'http://img1.lotour.net/Inspiration/2016/1209/20161209115009462108991_86.jpg',
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
