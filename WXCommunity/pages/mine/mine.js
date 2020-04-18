// pages/mine/mine.js
var util = require('../../utils/util.js');
const app = getApp();

Page({

  /**
   * 页面的初始数据
   */
  data: {
    date: null,
    health_status: "记得上报健康状态哟",
    trip_repo: "填写行程，将查询是否曾与确诊病患同行。有情况会第一时间通知并采取措施。",
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo')
  },

  //获取userInfo
  getUserInfo: function (e) {
    var that = this;
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    that.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },
  /**
   * 获取时间信息
   */
  getDate: function () {
    var that = this;
    // 调用函数时，传入new Date()参数，返回值是日期和时间
    var date = util.formatDate(new Date());
    // 再通过setData更改Page()里面的data，动态更新页面的数据
    that.setData({
      date: date
    });
  },

  getOnloadInfo: function () {
    var that = this;
    if (app.globalData.userInfo) {
      that.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (that.data.canIUse) {
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        that.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          that.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },

  //事件处理函数
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },

  //跳转健康上报页面
  goToHealthRepo: function () {
    console.log(app.globalData.u_id);
    wx.navigateTo({
      url: '../healthRepo/healthRepo',
    })
  },

  // 跳转丁香医生
  goToProgramDX: function () {
    wx.navigateTo({
      url: '../external/breakRumor/breakRumor',
   })
  },

  //跳转疫情地图
  goToVirusMap:function(){
    wx.navigateTo({
      url: '../external/virusMap/virusMap',
   })
  },

  //跳转行程查询
  goToTripCheck:function(){
    wx.navigateTo({
      url: '../external/tripCheck/tripCheck',
   })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function () {
    this.getOnloadInfo();
    this.getDate();
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