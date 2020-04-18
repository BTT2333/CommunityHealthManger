package indi.btt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.WXImg;
import indi.btt.service.WXService;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月12日 下午6:23:58 explain:
 */
@Controller
public class WXController {

	@Autowired
	WXService wxService;

	@ResponseBody
	@RequestMapping("/queryWXIndexInfo")
	public Map<String, Object> queryWXIndexInfo() {
		Map<String, Object> map = new HashMap<String, Object>();

		System.out.println("============");
		List<WXImg> queryImgByGenre = wxService.queryImgByGenre(1);
		System.out.println("queryImgByGenre" + queryImgByGenre);
		map.put("queryImgByGenre", queryImgByGenre);
		return map;
	}
	
	@RequestMapping("/login")
	public String login(String username,String pwd)
	{
		System.out.println(username+pwd);
		return "lihua";
		
	}
}
