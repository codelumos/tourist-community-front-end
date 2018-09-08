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

// 导入当前系统的全局样式
import '../static/css/site.css';

Vue.config.productionTip = false;

// 导入 axios 和 vue-axios 做ajax
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.use(VueAxios, axios)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});

// 跳转后返回顶部
router.afterEach((to,from,next) => {
  window.scrollTo(0,0);
})
