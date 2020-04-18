// pages/service/carOrder/carOrder.js
var util = require('../../../utils/util.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    toast: false,
    hideToast: false,
    date: util.formatDate(new Date()),

    carNumber: [1, 2, 3, 4, 5, 6],
    carNumberIndex: 0,

    c_reason: "无",
  },

  bindReason: function (e) {
    console.log(e.detail.value);
    this.setData({
      c_reason: e.detail.value
    })
  },

  bindCarNumberChange: function (e) {
    console.log('picker carNumber 发生选择改变，携带值为', e.detail.value);
    this.setData({
      carNumberIndex: e.detail.value
    })
  },

  openToast: function () {
    this.setData({
      toast: true
    });
    setTimeout(() => {
      this.setData({
        hideToast: true
      });
      setTimeout(() => {
        this.setData({
          toast: false,
          hideToast: false,
        });
      }, 300);
    }, 3000);
  },

  bindDateChange: function (e) {
    this.setData({
      date: e.detail.value
    })
  },

  bindCarNumberChange: function (e) {
    console.log('picker carNumber 发生选择改变，携带值为', e.detail.value);
    this.setData({
      carNumberIndex: e.detail.value
    })
  },

  submit: function () {
    console.log(getApp().globalData.u_id);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/addCarRegister',
      method: "POST",
      data: {
        u_id: getApp().globalData.u_id,
        c_date: that.data.date,
        c_hour: that.data.carNumber[that.data.carNumberIndex],
        c_reason: that.data.c_reason,
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res);
        that.openToast();
        setTimeout(function () {
          //要延时执行的代码
          that.goToManage();
        }, 1000);
      }
    })
  },

  goToManage: function () {
    wx.switchTab({
      url: '../../manage/manage',
    })
  },



  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

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