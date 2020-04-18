package indi.btt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.VirusRegister;
import indi.btt.service.VirusRegisterService;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月28日 下午4:27:06 explain:
 */
@Controller
public class VirusRegisterController {

	@Autowired
	VirusRegisterService virusRegisterService;

	@ResponseBody
	@RequestMapping("/addVirusRegister")
	public Map<String, Object> addVirusRegister(int u_id, String s_name, String s_phone, String s_hospital, String s_date,
			String s_other) {
		System.out.println("============addVirusRegister=============");
		Map<String, Object> map = new HashMap<String, Object>();
		VirusRegister virusRegister = new VirusRegister(u_id, s_name, s_phone, s_hospital, s_date, s_other);
		virusRegisterService.addVirusRegister(virusRegister);
		map.put("virusRegister", virusRegister);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryVirusRegisterByName")
	public Map<String, Object> queryVirusRegisterByName(String s_name) {
		System.out.println("============queryVirusRegisterByName=============");
		Map<String, Object> map = new HashMap<String, Object>();
		VirusRegister virusRegister = virusRegisterService.queryVirusRegisterByName(s_name);
		map.put("virusRegister", virusRegister);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryVirusRegisterAll")
	public Map<String, Object> queryVirusRegisterAll() {
		System.out.println("============queryVirusRegisterAll=============");
		Map<String, Object> map = new HashMap<String, Object>();
		List<VirusRegister> virusRegister = virusRegisterService.queryVirusRegisterAll();
		map.put("virusRegister", virusRegister);
		return map;
	}
	
}
