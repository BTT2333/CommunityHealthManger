package indi.btt.dao;

import org.springframework.web.bind.annotation.ResponseBody;

import indi.btt.domain.User;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月12日 上午11:28:38 
* explain:
*/
@ResponseBody
public interface UserDao {
	
	/**
	 * 根据手机号查询user
	 * @param u_phone
	 * @return
	 */
	public User queryUserByUPhone(String u_phone);
	
	public void addUser(User user);
	
	public User queryUserByID(int u_id);
}
