package indi.btt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.CarRegisterDao;
import indi.btt.domain.CarRegister;
import indi.btt.domain.CarRegisterResult;
import indi.btt.service.CarRegisterService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午5:43:47 
* explain:
*/
@Service
public class CarRegisterServiceImpl implements CarRegisterService {

	@Autowired
	CarRegisterDao carRegisterDao;
	
	@Override
	public void addCarRegister(CarRegister carRegister) {
		// TODO Auto-generated method stub
		carRegisterDao.addCarRegister(carRegister);
	}

	@Override
	public List<CarRegisterResult> queryNextDayCarRegister() {
		// TODO Auto-generated method stub
		return carRegisterDao.queryNextDayCarRegister();
	}

	@Override
	public List<CarRegisterResult> queryAfterCarRegister() {
		// TODO Auto-generated method stub
		return carRegisterDao.queryAfterCarRegister();
	}

}
