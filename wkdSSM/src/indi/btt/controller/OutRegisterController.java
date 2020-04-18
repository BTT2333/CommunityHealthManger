package indi.btt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.OutRegister;
import indi.btt.service.OutRegisterService;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月23日 下午4:52:12 explain:
 */
@Controller
public class OutRegisterController {
	
	@Autowired
	OutRegisterService outRegisterService;

	@ResponseBody
	@RequestMapping("/addOutRegister")
	public Map<String, Object> addOutRegister(int u_id, String date, String time, String name, String phone, int outTime,
			String reason, int isFriend) {
		System.out.println("============addOutRegister=============");
		Map<String, Object> map = new HashMap<String, Object>();
		OutRegister outRegister = new OutRegister(u_id,date,time,name,phone,outTime,reason,isFriend);
		outRegisterService.addOutRegister(outRegister);
		map.put("outRegister", outRegister);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryOutRegisterByDate")
	public Map<String, Object> queryOutRegisterByDate(String date, String time) {
		System.out.println("============queryOutRegisterByDate=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<OutRegister> outRegister = outRegisterService.queryOutRegisterByDate(date, time);
		map.put("outRegister", outRegister);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryOutRegisterAll")
	public Map<String, Object> queryOutRegisterAll() {
		System.out.println("============queryOutRegisterAll=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<OutRegister> outRegister = outRegisterService.queryOutRegisterAll();
		map.put("outRegister", outRegister);
		return map;
	}
	
}
