// pages/admin/adminManage/adminManage.js
var app=getApp();

Page({

  /**
   * 页面的初始数据
   */
  data: {
    toast: false,
    hideToast: false,

    notice:null,
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
    }, 2000);
  },

  noticeInput:function(e){
    console.log(e.detail.value);
    var that = this;
    that.setData({
      notice: e.detail.value
    })
  },

  submit:function(){
    app.globalData.u_notice = this.data.notice;
    console.log(app.globalData.u_notice);
    this.openToast();
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