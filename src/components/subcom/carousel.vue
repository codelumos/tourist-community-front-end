<template>
  <div class="carouselDiv">
    <Carousel class="carousel" autoplay v-model="value" loop>
      <CarouselItem v-for="item in content" :key="item.id">
        <div class="demo-carousel">
          <router-link :to="item.context_src">
            <img :src="item.img_src" alt="">
            <h5>{{item.title}}</h5>
          </router-link>
        </div>
      </CarouselItem>
    </Carousel>
  </div>
</template>

<script>
  export default {
    name: "carousel",
    data() {
      return {
        content: [
          {
            id: 1,
            img_src: '\\static\\img\\title01.jpg',
            context_src: '/blog/27',
            title: '全国哪个城市比它更拽：出门坐游艇，推窗望沙漠',
          },
          {
            id: 2,
            img_src: '\\static\\img\\title02.jpg',
            context_src: '/blog/25',
            title: '泡在剑桥，看学霸们课余生活有多幸福',
          },
          {
            id: 3,
            img_src: '\\static\\img\\title03.jpg',
            context_src: '/blog/28',
            title: '如何找到20元人民币的背后图案',
          },
          {
            id: 4,
            img_src: '\\static\\img\\title04.jpg',
            context_src: '/blog/26',
            title: '一万二，来法国尝尝世界上最贵的小龙虾',
          }
        ],
        value: 0
      }
    }
  }
</script>

<style scoped>
  .carouselDiv {
    max-height: 800px;
    overflow: hidden;

  }

  .carousel {
    max-height: 680px;
    overflow: hidden;
    position: relative;
    top: 0;
  }

  img {
    background: rgba(0, 0, 0, 0.2);
    width: 100%;
  }

  .demo-carousel h5 {
    text-align: center;
    font: 24px/50px \5FAE\8F6F\96C5\9ED1, "Microsoft YaHei";
    color: #fff;
    position: relative;
    width: 100%;
    bottom: 85px;
  }
</style>
