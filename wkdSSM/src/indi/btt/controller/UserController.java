package indi.btt.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import indi.btt.domain.User;
import indi.btt.domain.WXImg;
import indi.btt.service.UserService;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月12日 上午11:47:03 explain:
 */
@Controller
public class UserController {

	@Autowired
	UserService usreService;

	@ResponseBody
	@RequestMapping("/queryUser")
	public Map<String, Object> queryUser(String u_phone, String u_pwd) {
		Map<String, Object> map = new HashMap<String, Object>();

		System.out.println("============");
		User user = usreService.queryUserByUPhone(u_phone);
		if (u_pwd.equals(user.getU_pwd())) {
			map.put("flag", 1);
			System.out.println(user);
		} else {
			map.put("flag", 0);
		}
		map.put("queryUser", user);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryUserByID")
	public Map<String, Object> queryUserByID(int u_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("==========queryUserByID===========");
		User user = usreService.queryUserByID(u_id);
		System.out.println(user);
		map.put("queryUser", user);
		return map;
	}

	@ResponseBody
	@RequestMapping("/register")
	public Map<String, Object> register(String u_name, String u_phone, String u_age, String u_sex, int u_address,
			String u_doorplate, String u_pwd){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("============register=============");
		User user = new User(u_name, u_phone, u_age, u_sex, u_address, u_doorplate, u_pwd);
		System.out.println(user);
		usreService.addUser(user);
		map.put("addUser", user);
		return map;
	}

}
