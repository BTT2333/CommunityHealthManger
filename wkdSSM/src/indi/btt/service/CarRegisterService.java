package indi.btt.service;

import java.util.List;

import indi.btt.domain.CarRegister;
import indi.btt.domain.CarRegisterResult;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月28日 下午5:42:51 explain:
 */
public interface CarRegisterService {
	
	public void addCarRegister(CarRegister carRegister);

	public List<CarRegisterResult> queryNextDayCarRegister();

	public List<CarRegisterResult> queryAfterCarRegister();
}
