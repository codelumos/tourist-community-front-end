<template>
  <div class="travelInfo" v-if="travelList">

    <Card style="width: 100%;margin-bottom: 20px" v-for="(travel,index) in travelList.appointments"
          :key="travel.appointmentId">
      <div class="card-content">
        <Collapse accordion simple>
            <Panel hide-arrow name="1">
            <div slot="" class="collapse-head">
              <div class="card-head">

            <span class="card-author">
              <img :src="travelList.accountUps[index].imagePath" alt="">
            </span>

                <h3>
                  <label>{{travel.lp}}-{{travel.sp}}-{{travel.spotName}} {{travel.tag1}}</label>
                </h3>
              </div>
              <div class="card-body">
                <div class="topic-list-content">
                  <p v-text="travel.contentEx">

                  </p>

                </div>
              </div>
              <div class="card-bottom">
                <div class="topic-list-subtitle clearfix">
                  <a>#{{travelDate(travel.time)}} 出发#</a>
                  <a>{{travel.sum}}人团</a>
                  <a>{{travel.tag1}}</a>
                  <a>{{travel.tag2}}</a>
                  <a>{{travel.tag3}}</a>
                </div>
              </div>
            </div>

            <div class="card-hidden" slot="content">

              <img :src="travel.imagePath" alt="">

              <Divider/>
              <comment :id="travel.appointmentId"></comment>
            </div>
          </Panel>
        </Collapse>
      </div>
    </Card>
  </div>
</template>

<script>
  import comment from '../../subcom/comment';
  import Moment from 'moment';

  export default {
    name: "travel-info",
    props: ['travelList'],
    data() {
      return {

      }
    },
    methods: {

    },
    computed: {
      travelDate() {
        return function (input) {
          return Moment(Date.parse(input)).format("YYYY-MM-DD");
        }
      },
    },
    components: {
      comment
    }
  }
  </script>

<style scoped>
  .card-head {
    width: 100%;
  }

  .card-head h3 {
    display: inline-block;
    vertical-align: top;
    /*float: left;*/
  }

  .card-content {
    padding: 16px;
  }

  .card-author {
    display: inline-block;
    width: 24px;
    height: 24px;
    margin-right: 12px;
  }

  .card-author img {
    width: 24px;
    height: 24px;
    border-radius: 100%;
    margin-top: 5px;
  }

  .title h3 {
    font-size: 16px;
    line-height: 1.3;
    background: 0;
    width: 523px;
  }

  a {
    color: #17233d;
    text-decoration: none
  }

  a:hover {
    color: #2d8cf0
  }

  .title .topic-list-count a {
    font-size: 12px;
    line-height: 14px;
    border-radius: 2px;
    display: inline-block;
    background-color: #F9E9D8;
    color: #825d5b;
    padding: 2px 6px
  }

  .title .topic-list-count a:hover {
    background-color: #F8E0C6
  }

  .topic-list-subtitle {
    font-size: 14px;
    text-align: right;
  }

  .topic-list-content p {
    font-size: 16px;
    text-indent: 2em;
    color: #666;
    margin: 0
  }

  .card-hidden img {
    margin-top: 10px;
    width: 100%;
    border-radius: 5px;
  }

</style>
