// pages/admin/adminVirus/adminVirus.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    inputShowed: false,
    inputVal: "",

    dataList: []
  },

  showInput: function () {
    this.setData({
      inputShowed: true
    });
  },
  hideInput: function () {
    this.setData({
      inputVal: "",
      inputShowed: false
    });
    this.getDataAll();
  },
  clearInput: function () {
    this.setData({
      inputVal: ""
    });
  },
  inputTyping: function (e) {
    console.log(e.detail.value);
    this.setData({
      inputVal: e.detail.value
    });
  },

  search: function () {
    console.log("====search===");
    this.getDataByName();
  },

  getDataByName:function(){
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryVirusRegisterByName',
      method: "POST",
      data: {
        s_name: that.data.inputVal
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res);
        that.setData({
          dataList: [res.data.virusRegister]
        })
        console.log(that.data.dataList);
      }
    })
  },

  getDataAll: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryVirusRegisterAll',
      success(res) {
        // console.log(res);
        that.setData({
          dataList: res.data.virusRegister
        })
        console.log(that.data.dataList);
      }
    })
  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getDataAll();
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