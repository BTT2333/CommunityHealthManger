// pages/service/virusRegister/virusRegister.js
var util = require('../../../utils/util.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    toast: false,
    hideToast: false,
    date: util.formatDate(new Date()),
    s_name: null,
    s_phone: null,
    s_hospital: null,
    s_other: "无"
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
  nameInput:function(e){
    console.log(e.detail.value);
    var that = this;
    that.setData({
      s_name: e.detail.value
    })
  },
  phoneInput:function(e){
    console.log(e.detail.value);
    var that = this;
    that.setData({
      s_phone: e.detail.value
    })
  },
  hospitalInput:function(e){
    console.log(e.detail.value);
    var that = this;
    that.setData({
      s_hospital: e.detail.value
    })
  },
  otherInput:function(e){
    console.log(e.detail.value);
    var that = this;
    that.setData({
      s_other: e.detail.value
    })
  },

  //submit
  submit: function () {
    console.log(getApp().globalData.u_id);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/addVirusRegister',
      method: "POST",
      data: {
        u_id: getApp().globalData.u_id,
        s_name: that.data.s_name,
        s_phone: that.data.s_phone,
        s_hospital: that.data.s_hospital,
        s_date: that.data.date,
        s_other: that.data.s_other,
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