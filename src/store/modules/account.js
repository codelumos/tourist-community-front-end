import { INITACCOUNT,ACCOUNTLOGOUT } from '../mutations/mutation-types';
// 用户对象
const account = {
  state: {
    accountInfo: null
  },
  mutations: {
    [INITACCOUNT] (state,accountInfo) {
      state.accountInfo = accountInfo;
    },
    [ACCOUNTLOGOUT](state){
      state.accountInfo = null;
    }
  },
  getter:{

  }

}

export default account
