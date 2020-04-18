package indi.btt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.btt.domain.PropertyRepair;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月29日 下午2:09:50 
* explain:
*/
@Repository
public interface PropertyRepairDao {
	
	public void addPropertyRepair(PropertyRepair propertyRepair);
	
	public List<PropertyRepair> queryPropertyRepairAll();
	
	public List<PropertyRepair> queryPropertyRepairNotCompleted();
}
