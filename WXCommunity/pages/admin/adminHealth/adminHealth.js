Page({

  /**
   * 页面的初始数据
   */
  data: {
    currentIndexNav: 0,
    dataList: []
  },

  activeNav: function (e) {
    console.log(e.currentTarget.dataset.index);
    var index = e.currentTarget.dataset.index;
    var that = this;
    that.setData({
      currentIndexNav: index
    })
    if (that.data.currentIndexNav == 0) {
      that.getDataYesterday();
    }else{
      that.getDataAll();
    }
  },

  getDataYesterday: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryUnhealthyYesterday',
      success(res) {
        // console.log(res);
        that.setData({
          dataList:res.data.queryUnhealthyYesterday
        })
        console.log(that.data.dataList);
      }
    })
  },

  getDataAll:function(){
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryUnhealthyInfo',
      success(res) {
        // console.log(res);
        that.setData({
          dataList:res.data.queryUnhealthyUser
        })
        console.log(that.data.dataList);
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getDataYesterday();
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