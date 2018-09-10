import Vue from 'vue';
import Router from 'vue-router';
import index from '../components/index.vue';

// 文本编辑
import editor from '../components/editor/editor';

// 博客
import blog from '../components/blog/page';
import blogList from '../components/blog/blogList';

// 账户
import accountForm from '../components/account/accountForm';
import login from '../components/account/subcom/login';
import register from '../components/account/subcom/register';
import account from '../components/account/account';
import otherAccount from '../components/account/otherAccount';

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
      path: '/accountForm',
      name: 'accountForm',
      component: accountForm,
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
    },
    {
      path: '/blog',
      name :'blog',
      component: blog
    },
    {
      path: '/blogList',
      name: 'blogList',
      component: blogList
    },
    {
      path: '/account',
      name: 'account',
      component: account
    },
    {
      path: '/otherAccount',
      name: 'otherAccount',
      component: otherAccount
    }
  ]
});


