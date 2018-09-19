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
        <router-link  v-for="option in item.children" class="demo-auto-complete-title" v-bind="{to: '/blogList/'+option.title}" :key="option.title">
          <Option :value="option.title" :key="option.title">
          {{ option.title }}
        </Option>
        </router-link>

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
                title: '橘子洲'

              },
              {
                title: '玻璃栈道'
              }
            ]
          },
          {
            title: '热门主题',
            children: [
              {
                title: '骑行'
              },
              {
                title: '自驾游'
              }
            ]
          },
          {
            title: '旅游时间',
            children: [
              {
                title: '国庆节'
              }
            ]
          }
        ]
      }
    },
    methods:{
      search(){
        if(this.value.trim().length === 0){
          this.$Message.warning({
            content: "请输入或选择关键词",
            duration: 5
          })
        }else{
          this.$router.push({
            path:"/blogList/" + this.value
          });
        }

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
