package indi.btt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.btt.domain.OutRegister;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月23日 下午4:43:44 
* explain:
*/
@Repository
public interface OutRegisterDao {
	public void addOutRegister(OutRegister outRegister);
	
	public List<OutRegister> queryOutRegisterByDate(String date, String time);
	
	public List<OutRegister> queryOutRegisterAll();
}
