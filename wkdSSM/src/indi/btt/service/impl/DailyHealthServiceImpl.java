package indi.btt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.DailyHealthDao;
import indi.btt.domain.DailyHealth;
import indi.btt.domain.DailyHealthResult;
import indi.btt.domain.User;
import indi.btt.service.DailyHealthService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月20日 下午6:01:48 
* explain:
*/
@Service
public class DailyHealthServiceImpl implements DailyHealthService {
	
	@Autowired
	DailyHealthDao dailyHealthDao;
	
	@Override
	public void addDailyHealth(DailyHealth dailyHealth) {
		// TODO Auto-generated method stub
		dailyHealthDao.addDailyHealth(dailyHealth);
	}

	@Override
	public List<DailyHealth> queryHealthByID(int u_id){
		return dailyHealthDao.queryHealthByID(u_id);
	}
	
	@Override
	public List<Float> queryTemperatureByID(int u_id){
		return dailyHealthDao.queryTemperatureByID(u_id);
	}

	@Override
	public List<DailyHealthResult> queryUnhealthyYesterday() {
		// TODO Auto-generated method stub
		return dailyHealthDao.queryUnhealthyYesterday();
	}

	@Override
	public List<User> queryUnhealthyInfo() {
		// TODO Auto-generated method stub
		return dailyHealthDao.queryUnhealthyInfo();
	}
}
