package indi.btt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.PropertyRepairDao;
import indi.btt.domain.PropertyRepair;
import indi.btt.service.PropertyRepairService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月29日 下午2:23:43 
* explain:
*/
@Service
public class PropertyRepairServiceImpl implements PropertyRepairService {
	
	@Autowired
	PropertyRepairDao propertyRepairDao;

	@Override
	public void addPropertyRepair(PropertyRepair propertyRepair) {
		// TODO Auto-generated method stub
		propertyRepairDao.addPropertyRepair(propertyRepair);
	}

	@Override
	public List<PropertyRepair> queryPropertyRepairAll() {
		// TODO Auto-generated method stub
		return propertyRepairDao.queryPropertyRepairAll();
	}

	@Override
	public List<PropertyRepair> queryPropertyRepairNotCompleted() {
		// TODO Auto-generated method stub
		return propertyRepairDao.queryPropertyRepairNotCompleted();
	}

}
