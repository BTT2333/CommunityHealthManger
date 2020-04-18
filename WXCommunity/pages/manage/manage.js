// pages/manage/manage.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    notice:getApp().globalData.u_notice,
    cardCur: 0,
    swiperList: [{
      id: 0,
      type: 'image',
      url: '../../img/image/banner01.jpg',
    }, {
      id: 1,
      type: 'image',
      url: '../../img/image/banner02.jpg'
    }, {
      id: 2,
      type: 'image',
      url: '../../img/image/banner03.jpg'
    }, {
      id: 3,
      type: 'image',
      url: '../../img/image/banner04.jpg'
    }, {
      id: 4,
      type: 'image',
      url: '../../img/image/banner05.jpg'
    }, {
      id: 5,
      type: 'image',
      url: '../../img/image/banner06.jpg'
    }],

    serviceList: [{
      id: 0,
      name: "业主出入登记",
      url: '../../img/icon/out.png',
      intro: '请遵守相关出行政策'
    }, {
      id: 1,
      name: "预约访客登记",
      url: '../../img/icon/friend.png',
      intro: '来访请先预约登记'
    }, {
      id: 2,
      name: "新冠重症登记",
      url: '../../img/icon/sick.png',
      intro: '新冠肺炎重症登记'
    }, {
      id: 3,
      name: "社区车辆预约",
      url: '../../img/icon/car.png',
      intro: '疫情期间车辆出行预约'
    }, {
      id: 4,
      name: "社区帮助",
      url: '../../img/icon/Help.png',
      intro: '重服务，优治理，惠民生'
    }, {
      id: 5,
      name: "疫情资讯",
      url: '../../img/icon/News.png',
      intro: '全球疫情相关资讯新闻'
    }, {
      id: 6,
      name: "物业报修",
      url: '../../img/icon/repair.png',
      intro: '小区物业报修登记'
    }, {
      id: 7,
      name: "社区证明",
      url: '../../img/icon/Approve.png',
      intro: '如需社区证明请登记'
    }]
  },

  //跳转服务项
  goToService:function(e){
    var that = this;
    var id = e.currentTarget.id;
    console.log(id);
    switch(id){
      case '0':
        that.goToServiceOwner();
        break;
      case '1':
        that.goToServiceFriend();
        break;
      case '2':
        that.goToServiceSick();
        break;
      case '3':
        that.goToServiceCar();
        break;
      case '4':
        that.goToServiceHelp();
        break;
      case '5':
        that.goToServiceNews();
        break;
      case '6':
        that.goToServiceRepair();
        break;
      case '7':
        that.goToServiceApprove();
        break;
    }
  },

  //业主出入登记
  goToServiceOwner:function(){
    console.log("业主出入登记");
    wx.navigateTo({
      url: '../service/ownerRegister/ownerRegister',
   })
  },
  goToServiceFriend:function(){
    console.log("预约访客登记");
    wx.navigateTo({
      url: '../service/friendRegister/friendRegister',
   })
  },
  goToServiceSick:function(){
    console.log("新冠重症登记");
    wx.navigateTo({
      url: '../service/virusRegister/virusRegister',
   })
  },
  goToServiceCar:function(){
    console.log("社区车辆预约");
    wx.navigateTo({
      url: '../service/carOrder/carOrder',
   })
  },
  goToServiceHelp:function(){
    console.log("社区帮助");
    wx.navigateTo({
      url: '../service/helpYellowPage/helpYellowPage',
   })
  },
  goToServiceNews:function(){
    console.log("疫情资讯");
    wx.navigateTo({
      url: '../external/virusNews/virusNews',
   })
  },
  goToServiceRepair:function(){
    console.log("物业报修");
    wx.navigateTo({
      url: '../service/propertyRepair/propertyRepair',
   })
  },
  goToServiceApprove:function(){
    console.log("社区证明");
    wx.navigateTo({
      url: '../service/communityProve/communityProve',
   })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(this.data.notice);
    console.log(getApp().globalData.u_notice);
    this.setData({
      notice:getApp().globalData.u_notice,
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})