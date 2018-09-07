<template>
  <div class="carouselDiv">
    <Carousel class="carousel" autoplay v-model="value" loop>
      <CarouselItem>
        <div class="demo-carousel">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2018/0824/20180824213618709837790_680.jpg" alt="">
            <h5>全国哪个城市比它更拽：出门坐游艇，推窗望沙漠</h5>
          </a>

        </div>
      </CarouselItem>
      <CarouselItem>
        <div class="demo-carousel">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2018/0826/20180826105055486904281_680.jpg" alt="">
            <h5>一万二，来法国尝尝世界上最贵的小龙虾</h5>
          </a>


        </div>
      </CarouselItem>
      <CarouselItem>
        <div class="demo-carousel">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2018/0901/20180901233346823978180_680.jpg" alt="">
            <h5>如何找到20元人民币的背后图案</h5>
          </a>


        </div>
      </CarouselItem>
      <CarouselItem>
        <div class="demo-carousel">
          <a href="">
            <img src="http://img1.lotour.net/Inspiration/2018/0820/20180820183354380596668_680.jpg" alt="">
            <h5>加贝尔湖畔，太阳送给月亮的吻</h5>
          </a>


        </div>
      </CarouselItem>
    </Carousel>
  </div>

</template>

<script>
    export default {
        name: "carousel",
      data () {
        return {
          value: 0
        }
      }
    }
</script>

<style scoped>
  .carouselDiv
  {
    max-height: 800px;
    overflow: hidden;

  }
  .carousel
  {
    max-height: 680px;
    overflow: hidden;
    position: relative;
    top: 0;
  }

  img
  {
    background: rgba(0,0,0,0.2);
    width: 100%;
  }

  .demo-carousel h5
  {
    text-align: center;
    font: 24px/50px \5FAE\8F6F\96C5\9ED1,"Microsoft YaHei";
    color: #fff;
    position: relative;
    bottom: 35px;
    width: 100%;

    bottom: 85px;
  }


</style>
