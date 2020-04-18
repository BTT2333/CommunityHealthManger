// pages/login/login.js
var utilMd5 = require('../../utils/md5');  
var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    topTips: false,
    hide: false,

    toast: false,
    hideToast: false,

    u_phone: '',
    u_pwd: '',
    flag: 0,
    text: ''
  },

  phoneInput: function (e) {
    var that = this;
    that.setData({
      u_phone: e.detail.value
    })
    // console.log(username);
  },

  pwdInput: function (e) {
    var that = this;
    that.setData({
      u_pwd: e.detail.value
    })
    // console.log(username);
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

  openTips: function () {
    this.setData({
      topTips: true
    });

    setTimeout(() => {
      this.setData({
        hide: true
      });
      setTimeout(() => {
        this.setData({
          topTips: false,
          hide: false,
        });
      }, 300);
    }, 2000);
  },



  login: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryUser',
      method: "POST",
      data: {
        u_phone: that.data.u_phone,
        u_pwd: utilMd5.hexMD5(that.data.u_pwd),
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res.data);
        if (res.data.flag == 0) {
          console.log("error code");
          that.openTips();
        } else {
          app.globalData.u_id = res.data.queryUser.u_id;
          that.openToast();
          setTimeout(function () {
            //要延时执行的代码
            that.goToMine();
          }, 1000);
        }

      }
    })
  },

  //成功后跳转首页
  goToMine: function () {
    this.setData({
      u_phone: null,
      u_pwd: null
    });
    wx.switchTab({
      url: '../mine/mine',
    })
  },

  register: function () {
    wx.navigateTo({
      url: '../register/register',
    })
  },

  //管理员登陆
  adminLogin: function () {
    wx.navigateTo({
      url: '../admin/adminLogin/adminLogin',
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