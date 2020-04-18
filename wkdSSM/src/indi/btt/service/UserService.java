package indi.btt.service;

import indi.btt.domain.User;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月12日 上午11:40:52 
* explain:
*/
public interface UserService {

	public User queryUserByUPhone(String u_phone);
	
	public void addUser(User user);
	
	public User queryUserByID(int u_id);
}
