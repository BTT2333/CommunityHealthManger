package indi.btt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.DailyHealth;
import indi.btt.domain.DailyHealthResult;
import indi.btt.domain.User;
import indi.btt.service.DailyHealthService;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月20日 下午6:15:01 explain:
 */
@Controller
public class DailyHealthController {

	@Autowired
	DailyHealthService dailyHealthService;

	@ResponseBody
	@RequestMapping("/addDailyHealth")
	public Map<String, Object> addDailyHealth(int u_id, int isContact, float temperature, String healthStatus,
			String otherRemarks) {
		System.out.println("============addDailyHealth=============");
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date);
		Map<String, Object> map = new HashMap<String, Object>();
		DailyHealth dailyHealth = new DailyHealth(u_id,date,isContact,temperature,healthStatus,otherRemarks);
		System.out.println(dailyHealth);
		dailyHealthService.addDailyHealth(dailyHealth);
		map.put("dailyHealth", dailyHealth);
		return map;

	}
	
	
	@ResponseBody
	@RequestMapping("/queryHealthByID")
	public Map<String, Object> queryHealthByID(int u_id){
		System.out.println("============queryDailyHealth=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<DailyHealth> queryDailyHealth = dailyHealthService.queryHealthByID(u_id);
		System.out.println("queryDailyHealth"+queryDailyHealth);
		map.put("queryDailyHealth", queryDailyHealth);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping("/queryTemperatureByID")
	public Map<String, Object> queryTemperatureByID(int u_id){
		System.out.println("============queryTemperatureByID=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<Float> queryDailyHealth = dailyHealthService.queryTemperatureByID(u_id);
		System.out.println("queryDailyHealth"+queryDailyHealth);
		map.put("queryDailyHealth", queryDailyHealth);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryUnhealthyYesterday")
	public Map<String, Object> queryUnhealthyYesterday(){
		System.out.println("============queryUnhealthyYesterday=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<DailyHealthResult> queryUnhealthyYesterday = dailyHealthService.queryUnhealthyYesterday();
		System.out.println("queryUnhealthyYesterday"+queryUnhealthyYesterday);
		map.put("queryUnhealthyYesterday", queryUnhealthyYesterday);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryUnhealthyInfo")
	public Map<String, Object> queryUnhealthyInfo(){
		System.out.println("============queryUnhealthyInfo=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<User> queryUnhealthyUser = dailyHealthService.queryUnhealthyInfo();
		System.out.println("queryUnhealthyUser"+queryUnhealthyUser);
		map.put("queryUnhealthyUser", queryUnhealthyUser);
		return map;
	}
	
	
	
}
