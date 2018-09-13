// 博客对象
import {INITBLOG, CANCELBLOG} from "../mutations/mutation-types";

const blog = {
  state: {
    blogInfo: null
  },
  mutations: {
    [INITBLOG] (state,blogInfo) {
      state.blogInfo = blogInfo;
    },
    [CANCELBLOG](state){
      state.blogInfo = null;
    }
  },
  getter:{

  }

}

export default blog
