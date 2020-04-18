// pages/admin/adminLogin/adminLogin.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    topTips: false,
    hide: false,

    toast: false,
    hideToast: false,

    adminName: null,
    adminPwd: null,

  },

  nameInput: function (e) {
    var that = this;
    that.setData({
      adminName: e.detail.value
    })
    // console.log(username);
  },

  pwdInput: function (e) {
    var that = this;
    that.setData({
      adminPwd: e.detail.value
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
    if (that.data.adminName == 'admin' && that.data.adminPwd == 'admin') {
      that.openToast();
      setTimeout(function () {
        //要延时执行的代码
        that.goToAdminManage();
      }, 1000);
    } else {
      console.log("admin error");
      that.openTips();
    }
  },

  goToAdminManage: function () {
    wx.navigateTo({
      url: '../adminManage/adminManage',
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