package indi.btt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.UserDao;
import indi.btt.domain.User;
import indi.btt.service.UserService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月12日 上午11:43:52 
* explain:
*/
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public User queryUserByUPhone(String u_phone){
		// TODO Auto-generated method stub
		return userDao.queryUserByUPhone(u_phone);
	}
	
	@Override
	public void addUser(User user){
		userDao.addUser(user);
	}

	
	public User queryUserByID(int u_id){
		return userDao.queryUserByID(u_id);
	}

}
