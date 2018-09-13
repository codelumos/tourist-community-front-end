// 导入 vuex 状态管理模式
import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);

// 导入 vue-along 长期保存state
import vuexAlong from 'vuex-along';

import account from './modules/account';
import blog from './modules/blog';

// 全局状态管理
// 用户
export default new Vuex.Store({
  modules:{
    account,
    blog
  },
  plugins: [vuexAlong]
});
