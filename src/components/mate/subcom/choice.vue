<template>
  <div class="choice">
    <Card>
        <dl class="filter">
          <dt>出发日期</dt>
          <dd>
            <a class="link-on">全部</a>
          </dd>
          <dd>
            <a href="" title="驴友9月结伴旅行">9月</a>
          </dd>
          <dd>
            <a href="" title="驴友中秋节结伴旅行">中秋节</a>
          </dd>
          <dd>
            <a href="" title="驴友10月结伴旅行">10月</a>
          </dd>
          <dd>
            <a href="" title="驴友国庆节结伴旅行">国庆节</a>
          </dd>
          <dd>
            <a href="" title="驴友11月结伴旅行">11月</a>
          </dd>
          <dd>
            <a href="" title="驴友12月结伴旅行">12月</a>
          </dd>
        </dl>
    </Card>
    <Card>
          <br>
          <dt>目的地</dt>
          <dd>
            <a class="link-on">全部</a>
          </dd>
          <dd>
            <a href="" title="丽江驴友网">丽江</a>
          </dd>
          <dd>
            <a href="" title="拉萨驴友网">拉萨</a>
          </dd>
          <dd>
            <a href="" title="西藏驴友网">西藏</a>
          </dd>
          <dd>
            <a href="" title="云南驴友网">云南</a>
          </dd>
          <dd>
            <a href="" title="大理驴友网">大理</a>
          </dd>
          <dd>
            <a href="" title="香格里拉驴友网">香格里拉</a>
          </dd>
          <dd>
            <a href="" title="成都驴友网">成都</a>
          </dd>
          <dd>
            <a href="" title="青海驴友网">青海</a>
          </dd>
          <dd>
            <a href="" title="昆明驴友网">昆明</a>
          </dd>
          <dd>
            <a href="" title="厦门驴友网">厦门</a>
          </dd>
          <dd>
            <a href="" title="北京驴友网">北京</a>
          </dd>
          <dd>
            <a href="" title="西宁驴友网">西宁</a>
          </dd>
          <dd>
            <a href="" title="杭州驴友网">杭州</a>
          </dd>
          <dd>
            <a href="" title="西安驴友网">西安</a>
          </dd>
          <dd>
            <a href="" title="上海驴友网">上海</a>
          </dd>
          <dd>
            <a href="" title="泰国驴友网">泰国</a>
          </dd>
          <dd>
            <a href="" title="三亚驴友网">三亚</a>
          </dd>
          <dd>
            <a href="" title="敦煌驴友网">敦煌</a>
          </dd>
          <dd>
            <a href="" title="亚丁驴友网">亚丁</a>
          </dd>
          <dd>
            <a href="" title="稻城驴友网">稻城</a>
          </dd>
          <dd>
          </dd>
          <dd>
            <input type="text" name="Search" placeholder="想去哪里？" class="col2"/>
            <button type="submit" class="btn btn-info btn-large">GO!</button>
          </dd>
          <hr/>
          <br>
          <dt>主题玩法</dt>
          <dd>
            <a class="link-on">全部</a>
          </dd>
          <dd>
            <a href="" title="驴友自驾结伴旅行">自驾</a>
          </dd>
          <dd>
            <a href="" title="驴友随性结伴旅行">随性</a>
          </dd>
          <dd>
            <a href="" title="驴友摄影结伴旅行">摄影</a>
          </dd>
          <dd>
            <a href="" title="驴友穷游结伴旅行">穷游</a>
          </dd>
          <dd>
            <a href="" title="驴友吃货结伴旅行">吃货</a>
          </dd>
          <dd>
            <a href="" title="驴友学生结伴旅行">学生</a>
          </dd>
          <dd>
            <a href="" title="驴友徒步结伴旅行">徒步</a>
          </dd>
          <dd>
            <a href="" title="驴友发呆结伴旅行">发呆</a>
          </dd>
          <dd>
            <a href="" title="驴友搭车结伴旅行">搭车</a>
          </dd>
          <dd>
            <a href="" title="驴友极限结伴旅行">极限</a>
          </dd>
          <dd>
            <a href="" title="驴友艳遇结伴旅行">艳遇</a>
          </dd>
          <dd>
            <a href="" title="驴友露营结伴旅行">露营</a>
          </dd>
          <dd>
            <a href="" title="驴友血拼结伴旅行">血拼</a>
          </dd>
          <dd>
            <a href="" title="驴友毕业季结伴旅行">毕业季</a>
          </dd>
          <dd>
            <a href="" title="驴友骑行结伴旅行">骑行</a>
          </dd>
          <dd>
            <a href="" title="驴友房车结伴旅行">房车</a>
          </dd>
    </Card>

  </div>
</template>

<script>
  export default {
    name: "choice"
  }
</script>

<style scoped>
  .choice{
    top: 66px;
    left: 1097.19px;
    width: 380px;
    position: fixed;
    z-index: 10;
  }
  .filter{
    margin-left: 32px;
    margin-bottom: 12px;
  }
  a, a:hover {
    color: #825d5b;
    text-decoration: none
  }

  .filter dt {
    font-size: 16px
  }

  .filter dd {
    font-size: 14px;
    padding: 8px;
    display: inline-block
  }

  .btn, .btn:hover {
    display: inline-block;
    *display: inline;
    *zoom: 1;
    font-size: 13px;
    color: #fff;
    padding: 4px 12px;
    margin-bottom: 0;
    line-height: 1.1;
    background-color: #825d5b;
    border: 1px solid #825d5b;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    cursor: pointer;
    vertical-align: middle;
    text-decoration: none
  }

  .btn:hover {
    border-color: #8d5f5e;
    background-color: #8d5f5e
  }

  .btn-large, .btn-large:hover {
    padding: 6px 14px
  }

  .btn-info, .btn-info:hover {
    color: #825d5b;
    border-color: #d3d3cc;
    background-color: #edede3
  }

  .btn-info:hover {
    background-color: #dbdbd4
  }

  .col2 {
    width: 120px;
  }

  .list-col2 li {
    width: 297px;
    margin: 0 30px 20px 0
  }
</style>
