package indi.btt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.VirusRegisterDao;
import indi.btt.domain.VirusRegister;
import indi.btt.service.VirusRegisterService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午3:12:36 
* explain:
*/
@Service
public class VirusRegisterServiceImpl implements VirusRegisterService {
	
	@Autowired
	VirusRegisterDao virusRegisterDao;

	@Override
	public void addVirusRegister(VirusRegister virusRegister) {
		// TODO Auto-generated method stub
		virusRegisterDao.addVirusRegister(virusRegister);
	}

	@Override
	public VirusRegister queryVirusRegisterByName(String s_name) {
		// TODO Auto-generated method stub
		return virusRegisterDao.queryVirusRegisterByName(s_name);
	}

	@Override
	public List<VirusRegister> queryVirusRegisterAll() {
		// TODO Auto-generated method stub
		return virusRegisterDao.queryVirusRegisterAll();
	}

}
