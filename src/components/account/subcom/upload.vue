<template>
 <div class="upload">
   <div class="demo-upload-list" v-for="item in uploadList">
     <template v-if="item.status === 'finished'">
       <img :src="item.url">
       <div class="demo-upload-list-cover">
         <Icon type="ios-eye-outline" @click.native="handleView(item.name)"></Icon>
       </div>
     </template>
     <template v-else>
       <Progress v-if="item.showProgress" :percent="item.percentage" hide-info></Progress>
     </template>
   </div>
   <Upload
     ref="upload"
     :show-upload-list="false"
     :default-file-list="defaultList"
     :on-success="handleSuccess"
     :format="['jpg','jpeg','png']"
     :max-size="2048"
     :on-format-error="handleFormatError"
     :on-exceeded-size="handleMaxSize"
     :before-upload="handleBeforeUpload"
     multiple
     type="drag"
     action="http://localhost:8088/travelbyex/v1/images"
     style="display: inline-block;width:58px;">
     <div style="width: 58px;height:58px;line-height: 58px;">
       <Icon type="ios-camera" size="20"></Icon>
     </div>
   </Upload>
   <Modal title="View Image" v-model="visible">
     <img :src="initImage" v-if="visible" style="width: 100%">
   </Modal>
 </div>
</template>
<script>
  export default {

    data () {
      return {
        defaultList: [
          {
            'name': '用户头像.jpg',
            'url': this.initImage
          }
        ],
        imgName: '',
        visible: false,
        uploadList: []
      }
    },
    props: ['initImage'],
    methods: {
      handleView (name) {
        this.imgName = name;
        this.visible = true;
      },
      handleRemove (file) {
        const fileList = this.$refs.upload.fileList;
        this.$refs.upload.fileList.splice(fileList.indexOf(file), 1);
      },
      handleSuccess (res, file) {

        if(res.status === 0){
          const fileList = this.$refs.upload.fileList;
          this.$refs.upload.fileList.splice(0, fileList.length);
          this.uploadList.push({
            'status': 'finished',
            'name': file.name,
            'url': res.message
          });
          this.$emit("getImage",this.uploadList[0].url)
        }

      },
      handleFormatError (file) {
        this.$Notice.warning({
          title: '文件格式不正确',
          desc: '文件：' + file.name + ' 的文件格式不正确，请上传jpg,jpeg或png'
        });
      },
      handleMaxSize (file) {
        this.$Notice.warning({
          title: '文件大小限制',
          desc: '文件：' + file.name + '太大，最大2M'
        });
      },
      handleBeforeUpload () {
        const check = this.uploadList.length < 2;
        if (!check) {
          this.$Notice.warning({
            title: '至多上传一个图片作为头像'
          });
        }
        return check;
      }
    },
    mounted () {
      this.uploadList = this.$refs.upload.fileList;
    }
  }
</script>
<style>
  .demo-upload-list{
    display: inline-block;
    width: 60px;
    height: 60px;
    text-align: center;
    line-height: 60px;
    border: 1px solid transparent;
    border-radius: 4px;
    overflow: hidden;
    background: #fff;
    position: relative;
    box-shadow: 0 1px 1px rgba(0,0,0,.2);
    margin-right: 4px;
  }
  .demo-upload-list img{
    width: 100%;
    height: 100%;
  }
  .demo-upload-list-cover{
    display: none;
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    background: rgba(0,0,0,.6);
  }
  .demo-upload-list:hover .demo-upload-list-cover{
    display: block;
  }
  .demo-upload-list-cover i{
    color: #fff;
    font-size: 20px;
    cursor: pointer;
    margin: 0 2px;
  }
</style>
