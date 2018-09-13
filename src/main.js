// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App';
import router from './router';

// 导入 css 重置
import '../static/css/normalize.css';


// 导入 font-awesome
import '../static/components/font-awesome-4.7.0/css/font-awesome.css';

// 注册 iview
import 'iview/dist/styles/iview.css';
// import '../static/css/theme/index.less';
import ivew from 'iview';
Vue.use(ivew);

import Moment from 'moment';
// 定义全局过滤器实现日期的格式化
Vue.filter("datefmt",function (input,fmtString) {
  // 使用 momentjs 日期格式化类库实现日期格式化
  return Moment(Date.parse(input)).format(fmtString);
});

// 导入当前系统的全局样式
import '../static/css/site.css';

Vue.config.productionTip = false;

// 导入 axios 和 vue-axios 做ajax
import axios from 'axios';
import VueAxios from 'vue-axios';
Vue.use(VueAxios, axios);

// 导入 vuex store模式
import store from './store';


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
});

// 跳转后返回顶部
router.afterEach((to,from,next) => {
  window.scrollTo(0,0);
});


