package indi.btt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.PropertyRepair;
import indi.btt.service.PropertyRepairService;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月29日 下午2:30:19 explain:
 */
@Controller
public class PropertyRepairController {

	@Autowired
	PropertyRepairService propertyRepairService;

	@ResponseBody
	@RequestMapping("/addPropertyRepair")
	public Map<String, Object> addPropertyRepair(int u_id, String p_name, String p_address, String p_phone,
			String p_type, String p_question, int p_isCompleted) {
		System.out.println("============addPropertyRepair=============");
		Map<String, Object> map = new HashMap<String, Object>();
		PropertyRepair propertyRepair = new PropertyRepair(u_id, p_name, p_address, p_phone, p_type, p_question,
				p_isCompleted);
		propertyRepairService.addPropertyRepair(propertyRepair);
		System.out.println(propertyRepair);
		map.put("propertyRepair", propertyRepair);
		return map;
	}

	@ResponseBody
	@RequestMapping("/queryPropertyRepairAll")
	public Map<String, Object> queryPropertyRepairAll() {
		System.out.println("==========queryPropertyRepairAll==========");
		Map<String, Object> map = new HashMap<String, Object>();
		List<PropertyRepair> propertyRepairList = propertyRepairService.queryPropertyRepairAll();
		System.out.println(propertyRepairList);
		map.put("propertyRepairList", propertyRepairList);

		return map;

	}

	@ResponseBody
	@RequestMapping("/queryPropertyRepairNotCompleted")
	public Map<String, Object> queryPropertyRepairNotCompleted() {
		System.out.println("==========queryPropertyRepairAll==========");
		Map<String, Object> map = new HashMap<String, Object>();
		List<PropertyRepair> propertyRepairList = propertyRepairService.queryPropertyRepairNotCompleted();
		System.out.println(propertyRepairList);
		map.put("propertyRepairList", propertyRepairList);

		return map;

	}

}
