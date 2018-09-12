<template>
  <div class="choice-card-group">
      <Col span="6">
      <Card class="card">
        <div class="card-context">

          <div class="time-choice">
            <h3>出发日期</h3>
            <ul>
              <li><a class="link-on">全部</a></li>
              <li><a href="" title="驴友9月结伴旅行">9月</a></li>
              <li><a href="" title="驴友中秋节结伴旅行">中秋节</a></li>
              <li><a href="" title="驴友10月结伴旅行">10月</a></li>
              <li><a href="" title="驴友国庆节结伴旅行">国庆节</a></li>
              <li><a href="" title="驴友11月结伴旅行">11月</a></li>
              <li><a href="" title="驴友12月结伴旅行">12月</a></li>
            </ul>
          </div>
        </div>
      </Card>
      </Col>
  </div>
</template>

<script>
    export default {
        name: "choice-card"
    }
</script>

<style scoped>
  .choice-card-group{
    margin-left: 32px;
    margin-bottom: 12px;
    float: left;
  }
  .card-context
  {
    padding: 16px;
  }
  .card-context ul li
  {
    display: inline-block;
  }
</style>
