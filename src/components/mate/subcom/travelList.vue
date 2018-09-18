<template>
  <div>
    <!--S: 主体部分-->

    <div class="context">


      <div>
        <h2 style="float: left">热门结伴</h2>
      </div>
      <br>
      <br/>
      <hr/>
      <br/>
      <travelCard :travelList="travelList"></travelCard>
      <div v-if="!travelList" class="none">
        啥拼途都找不到了...
      </div>

    </div>
    <!--E: 主体部分-->
  </div>
</template>

<script>
  import travelCard from './travelCard2';
  import choiceCard from './choiceCard';


  import {mapState} from 'vuex';

  export default {
    name: "travel-list",
    data() {
      return {}
    },
    props: ['travelList'],

    computed: {
      ...mapState({
        accountInfo: state => {
          return state.account.accountInfo;
        }
      }),
    },
    components: {
      travelCard,
      choiceCard
    }
  }
</script>

<style scoped>
  .context{
    min-height: 500px;
  }
  .none{
    font-size: 30px;
    text-align: center;
    font-weight: bold;
    margin-top: 120px;
  }

</style>
