import Vue from 'vue';
import Router from 'vue-router';
import index from '../components/index.vue';
import account from '../components/account/account';
import editor from '../components/editor/editor';

import login from '../components/account/login';
import register from '../components/account/register';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/index'
    },
    {
      path: '/index',
      name: 'index',
      component: index
    },
    {
      path: '/account',
      name: 'account',
      component: account,
      // 子路由
      children:[
        {
          path: 'login',
          name: 'login',
          component: login
        },
        {
          path: 'register',
          name: 'register',
          component: register
        }
      ]
    },
    {
      path: '/editor',
      name: 'editor',
      component: editor
    }
  ]
});
