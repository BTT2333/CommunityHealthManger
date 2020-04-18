// pages/healthRepo/healthRepo.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    healthItems: [{
        name: '健康',
        value: 'healthy'
      },
      {
        name: '发热',
        value: 'fever'
      },
      {
        name: '咳嗽',
        value: 'cough'
      },
      {
        name: '胸闷',
        value: 'chest'
      },
      {
        name: '已治愈',
        value: 'cure'
      },
      {
        name: '腹泻乏力等其他症状',
        value: 'other'
      }
    ],
    items: [{
        name: '是',
        value: 1
      },
      {
        name: '否',
        value: 0
      }
    ],
    isContact: null,
    temperature: null,
    healthStatus: null,
    otherRemarks: "无",
  },
  //过去14天内是否接触过确诊或疑似病例
  radioChange: function (e) {
    var that = this;
    console.log(e.detail.value);
    that.setData({
      isContact: e.detail.value
    })
  },

  //今日体温
  temperatureChange: function (e) {
    var that = this;
    console.log(e.detail.value);
    that.setData({
      temperature: e.detail.value
    })
  },
  //健康状态
  healthStatusChange: function (e) {
    var that = this;
    var health = "";
    for (var i = 0; i < e.detail.value.length; i++) {
      health += e.detail.value[i];
    }
    console.log(health);
    that.setData({
      healthStatus: health
    })
  },
  otherInput: function (e) {
    var that = this;
    console.log(e.detail.value);
    that.setData({
      otherRemarks: e.detail.value
    })
  },

  formSubmit: function () {
    console.log(getApp().globalData.u_id);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/addDailyHealth',
      method: "POST",
      data: {
        u_id: getApp().globalData.u_id,
        isContact: that.data.isContact,
        temperature: that.data.temperature,
        healthStatus: that.data.healthStatus,
        otherRemarks: that.data.otherRemarks,
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res);
        that.goToMine();
      }
    })
  },

  //成功后跳转首页
  goToMine: function () {
    wx.switchTab({
      url: '../mine/mine',
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