package indi.btt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.OutRegisterDao;
import indi.btt.domain.OutRegister;
import indi.btt.service.OutRegisterService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月23日 下午4:48:54 
* explain:
*/
@Service
public class OutRegisterServiceImpl implements OutRegisterService {
	
	@Autowired
	OutRegisterDao outRegisterDao;

	@Override
	public void addOutRegister(OutRegister outRegister) {
		// TODO Auto-generated method stub
		outRegisterDao.addOutRegister(outRegister);
	}

	@Override
	public List<OutRegister> queryOutRegisterByDate(String date, String time) {
		// TODO Auto-generated method stub
		return outRegisterDao.queryOutRegisterByDate(date, time);
	}

	@Override
	public List<OutRegister> queryOutRegisterAll() {
		// TODO Auto-generated method stub
		return outRegisterDao.queryOutRegisterAll();
	}

}
