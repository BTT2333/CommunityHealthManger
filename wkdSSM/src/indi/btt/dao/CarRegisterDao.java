package indi.btt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.btt.domain.CarRegister;
import indi.btt.domain.CarRegisterResult;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午5:34:22 
* explain:
*/
@Repository
public interface CarRegisterDao {

	public void addCarRegister(CarRegister carRegister);
	
	public List<CarRegisterResult> queryNextDayCarRegister();
	
	public List<CarRegisterResult> queryAfterCarRegister();
}
