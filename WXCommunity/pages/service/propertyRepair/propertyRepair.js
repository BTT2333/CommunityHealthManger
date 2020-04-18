// pages/service/propertyRepair/propertyRepair.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    files: [],

    name: null,
    phone: null,
    address: null,
    question: "无",

    type: ['房屋维修', '水电燃气', '公共设施'],
    typeIndex: 0,
  },

  nameInput: function (e) {
    console.log(e.detail.value)
    this.setData({
      name: e.detail.value
    })
  },
  addressInput: function (e) {
    console.log(e.detail.value)
    this.setData({
      address: e.detail.value
    })
  },
  phoneInput: function (e) {
    console.log(e.detail.value)
    this.setData({
      phone: e.detail.value
    })
  },

  typeChange: function (e) {
    console.log(e.detail.value)
    this.setData({
      typeIndex: e.detail.value
    })
  },
  questionInput: function (e) {
    console.log(e.detail.value);
    var that = this;
    that.setData({
      question: e.detail.value
    })
  },

  chooseImage: function (e) {
    var that = this;
    wx.chooseImage({
      sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
      sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
      success: function (res) {
        // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
        that.setData({
          files: that.data.files.concat(res.tempFilePaths)
        });
        // console.log(res);
      }
    })
  },
  previewImage: function (e) {
    wx.previewImage({
      current: e.currentTarget.id, // 当前显示图片的http链接
      urls: this.data.files // 需要预览的图片http链接列表
    })
  },

  getUserInfo: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryUserByID',
      method: "POST",
      data: {
        u_id: getApp().globalData.u_id,
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res);
        that.setData({
          name: res.data.queryUser.u_name,
          phone: res.data.queryUser.u_phone,
          address: res.data.queryUser.u_address + "栋" + res.data.queryUser.u_doorplate,
        })
      }
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

  submit: function () {
    console.log(getApp().globalData.u_id);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/addPropertyRepair',
      method: "POST",
      data: {
        u_id: getApp().globalData.u_id,
        p_name: that.data.name,
        p_address: that.data.address,
        p_phone: that.data.phone,
        p_type: that.data.type[that.data.typeIndex],
        p_question: that.data.question,
        p_isCompleted: 0
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

  //成功后跳转管理
  goToManage: function () {
    wx.switchTab({
      url: '../../manage/manage',
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getUserInfo();
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