package indi.btt.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.CarRegister;
import indi.btt.domain.CarRegisterResult;
import indi.btt.service.CarRegisterService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午5:52:10 
* explain:
*/
@Controller
public class CarRegisterController {

	@Autowired
	CarRegisterService carRegisterService;
	
	@ResponseBody
	@RequestMapping("/addCarRegister")
	public Map<String, Object> addCarRegister(int u_id, Date c_date, int c_hour, String c_reason) {
		System.out.println("============addCarRegister=============");
		Map<String, Object> map = new HashMap<String, Object>();
		CarRegister carRegister = new CarRegister(u_id, c_date, c_hour, c_reason);
		carRegisterService.addCarRegister(carRegister);
		map.put("carRegister", carRegister);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryNextDayCarRegister")
	public Map<String, Object> queryNextDayCarRegister() {
		System.out.println("============queryNextDayCarRegister=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<CarRegisterResult> carRegister = carRegisterService.queryNextDayCarRegister();
		map.put("carRegister", carRegister);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping("/queryAfterCarRegister")
	public Map<String, Object> queryAfterCarRegister() {
		System.out.println("============queryAfterCarRegister=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<CarRegisterResult> carRegister = carRegisterService.queryAfterCarRegister();
		map.put("carRegister", carRegister);
		return map;
	}
	
}
