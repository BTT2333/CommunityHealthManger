// pages/register/register.js
var utilMd5 = require('../../utils/md5');  

Page({

  /**
   * 页面的初始数据
   */
  data: {

    toast: false,
    hideToast: false,


    u_name: '',
    u_phone: '',
    u_age: "",
    u_sex: "",
    u_address: 0,
    u_doorplate: "",
    u_pwd: ""
  },

  handleInputName: function (e) {
    var that = this;
    that.setData({
      u_name: e.detail.value
    })
    console.log(that.data.u_name);
  },
  handleInputPhone: function (e) {
    var that = this;
    that.setData({
      u_phone: e.detail.value
    })
    console.log(that.data.u_phone);
  },
  handleInputAge: function (e) {
    var that = this;
    that.setData({
      u_age: e.detail.value
    })
    console.log(that.data.u_age);
  },
  handleInputSex: function (e) {
    var that = this;
    that.setData({
      u_sex: e.detail.value
    })
    console.log(that.data.u_sex);
  },
  handleInputAddress: function (e) {
    var that = this;
    that.setData({
      u_address: e.detail.value
    })
    console.log(that.data.u_address);
  },
  handleInputDoorplate: function (e) {
    var that = this;
    that.setData({
      u_doorplate: e.detail.value
    })
    console.log(that.data.u_doorplate);
  },
  handleNewChanges: function (e) {
    var that = this;
    that.setData({
      u_pwd: e.detail.value
    })
    console.log(that.data.u_pwd);
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

  register: function () {
    console.log("+++++++++++++++++");
    var that = this;
    wx.request({
      url: 'http://localhost:8080/register',
      method: "POST",
      data: {
        u_name: that.data.u_name,
        u_phone: that.data.u_phone,
        u_age: that.data.u_age,
        u_sex: that.data.u_sex,
        u_address: that.data.u_address,
        u_doorplate: that.data.u_doorplate,
        u_pwd: utilMd5.hexMD5(that.data.u_pwd),
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res);
        that.openToast();
        setTimeout(function () {
          //要延时执行的代码
          that.goToLogin();
        }, 1000);
      }
    })
  },

  //成功后跳转首页
  goToLogin: function () {
    wx.navigateTo({
      url: '../login/login',
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