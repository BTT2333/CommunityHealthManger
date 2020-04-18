package indi.btt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.btt.domain.VirusRegister;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午2:56:58 
* explain:
*/
@Repository
public interface VirusRegisterDao {

	public void addVirusRegister(VirusRegister virusRegister);
	
	public VirusRegister queryVirusRegisterByName(String s_name);
	
	public List<VirusRegister> queryVirusRegisterAll();
}
