// pages/service/ownerRegister/ownerRegister.js
var util = require('../../../utils/util.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    toast: false,
    hideToast: false,
    date: util.formatDate(new Date()),
    time: util.formatHourMin(new Date()),

    outTime: [1, 2, 3, 4, 5, 6],
    outTimeIndex: 0,

    name: null,
    phone: null,
    reason: "无",
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
  bindTimeChange: function (e) {
    this.setData({
      time: e.detail.value + ":00"
    })
  },
  bindOutTimeChange: function (e) {
    console.log('picker OutTime 发生选择改变，携带值为', e.detail.value);
    this.setData({
      outTimeIndex: e.detail.value
    })
  },

  //姓名
  inputName: function (e) {
    console.log(e.detail.value);
    var that = this;
    that.setData({
      name: e.detail.value
    })
  },
  inputPhone: function (e) {
    console.log(e.detail.value);
    var that = this;
    that.setData({
      phone: e.detail.value
    })
  },
  inputReason: function (e) {
    console.log(e.detail.value);
    var that = this;
    that.setData({
      reason: e.detail.value
    })
  },

  //submit
  submit: function () {
    console.log(getApp().globalData.u_id);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/addOutRegister',
      method: "POST",
      data: {
        u_id: getApp().globalData.u_id,
        date: that.data.date,
        time: that.data.time,
        name: that.data.name,
        phone: that.data.phone,
        outTime: that.data.outTime[that.data.outTimeIndex],
        reason: that.data.reason,
        isFriend: 0,
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
  onLoad: function (options) {},

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