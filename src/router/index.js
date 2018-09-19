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

// 拼途
import travel from '../components/mate/mate';
import travelList from '../components/mate/subcom/travelList';
import launchTravel from '../components/mate/subcom/launchCard';

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
      path: '/blog/:id',
      name :'blog',
      component: blog
    },
    {
      path: '/blogList/:keyword',
      name: 'blogList',
      component: blogList
    },
    {
      path: '/account',
      name: 'account',
      component: account
    },
    {
      path: '/otherAccount/:id',
      name: 'otherAccount',
      component: otherAccount
    },
    {
      path: '/travel',
      name: 'travel',
      component: travel,
      children:[
        {
          path: 'travelList',
          name: 'travelList',
          component: travelList
        },
        {
          path: 'launchTravel',
          name: 'launchTravel',
          component: launchTravel
        }
      ]
    }
  ]
});


