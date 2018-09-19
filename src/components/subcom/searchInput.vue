<template>
  <div class="searchInput">
    <AutoComplete
      v-model="value"
      icon="ios-search"
      placeholder="搜索感兴趣的话题/目的地"
      style="width:300px" >
      <div class="demo-auto-complete-item" v-for="item in data">
        <div class="demo-auto-complete-group">
          <span>{{ item.title }}</span>
        </div>
        <Option v-for="option in item.children" :value="option.title" :key="option.title">
          <a class="demo-auto-complete-title" href="#">{{ option.title }}</a>
          <!--<span class="demo-auto-complete-count">{{ option.count }} 人关注</span>-->
        </Option>
      </div>
      <div class="searchButton">
        <a href="javascript:void(0)" class="demo-auto-complete-more" @click="search()">搜索</a>
      </div>

    </AutoComplete>
  </div>
</template>
<script>
  export default {
    data () {
      return {
        value: '',
        data: [
          {
            title: '热门景点',
            children: [
              {
                title: '橘子洲',
                count: 10000,

              },
              {
                title: '玻璃栈道',
                count: 10600,

              }
            ]
          },
          {
            title: '热门主题',
            children: [
              {
                title: '骑行',
                count: 60100,

              },
              {
                title: '自驾游',
                count: 30010,

              }
            ]
          },
          {
            title: '旅游时间',
            children: [
              {
                title: '国庆节',
                count: 100000,

              }
            ]
          }
        ]
      }
    },
    methods:{
      search(){
        this.$router.push({
          path:"/blogList"
        });
      }
    }
  }
</script>
<style>
  .searchInput{
    display: inline-block;
    margin: 40px auto;
  }
  .demo-auto-complete-item{
    padding: 4px 0;
    border-bottom: 1px solid #F6F6F6;
  }
  .demo-auto-complete-group{
    font-size: 12px;
    padding: 4px 6px;
  }
  .demo-auto-complete-group span{
    color: #666;
    font-weight: bold;
  }
  .demo-auto-complete-group a{
    float: right;
  }
  .demo-auto-complete-count{
    float: right;
    color: #999;
  }
  .demo-auto-complete-more{
    display: block;
    margin: 0 auto;
    padding: 4px;
    text-align: center;
    font-size: 18px;
    color: #000;
  }
</style>
