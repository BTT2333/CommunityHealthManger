import * as echarts from '../../ec-canvas/echarts';

const app = getApp();

function getOption(sData) {
  var option = {
    title: {
      text: '过去14天体温信息',
      left: 'center'
    },
    color: ["#67E0E3"],
    legend: {
      data: ['A'],
      top: 50,
      left: 'center',
      z: 100
    },
    grid: {
      containLabel: true
    },
    tooltip: {
      show: true,
      trigger: 'axis'
    },
    xAxis: {
      type: 'category',
      boundaryGap: false,
      data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14],
      // show: false
    },
    yAxis: {
      x: 'center',
      type: 'value',
      splitLine: {
        lineStyle: {
          type: 'dashed'
        }
      },
      min: 35,
      max: 40
      // show: false
    },
    series: [{
      clickable: true,
      name: 'A',
      type: 'line',
      smooth: false,
      data: sData || [18, 36, 65, 30, 78, 40, 33],

    }]
  };

  return option;
}

function getBarOption() {
  return {
    title: {
      text: '过去7天本小区发热人数',
      left: 'center'
    },
    tooltip: {
      show: true,
      trigger: 'axis'
    },
    color: ["#67E0E3"],
    xAxis: {
      type: 'category',
      data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    },
    yAxis: {
      type: 'value'
    },
    series: [{
      clickable: true,
      data: [12, 20, 15, 8, 7, 11, 13],
      type: 'bar',
    }]
  };
}


let chartLine;

Page({
  data: {
    u_id: getApp().globalData.u_id,
    temperatureData: [],
    ec: {
      onInit: function (canvas, width, height, dpr) {
        chartLine = echarts.init(canvas, null, {
          width: width,
          height: height,
          devicePixelRatio: dpr // new
        });
        canvas.setChart(chartLine);
        var sData = [36.5, 36.9, 37.3, 37.6, 38.4, 38.5, 39.1, 38.5, 37.9, 37.3, 37.6, 38.4, 38.5, 39.1];
        var option = getOption(sData);
        chartLine.setOption(option);
        return chartLine;
      }
    },

    ecBar: {
      onInit: function (canvas, width, height, dpr) {
        const barChart = echarts.init(canvas, null, {
          width: width,
          height: height,
          devicePixelRatio: dpr // new
        });
        canvas.setChart(barChart);
        barChart.setOption(getBarOption());

        return barChart;
      }
    }
  },

  getOptionData: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/queryTemperatureByID',
      method: "POST",
      data: {
        u_id: that.data.u_id
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {
        console.log(res.data.queryDailyHealth);
        that.setData({
          temperatureData: res.data.queryDailyHealth
        })
      }
    })
  },

  change: function () {
    chartLine.setOption({
      series: [{
        data: this.data.temperatureData
      }]
    });
    console.log("change");
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getOptionData();
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    // this.data.timer = setInterval(this.change, 1000);
    this.data.timer = setTimeout(this.change, 1000);
  },
});