package indi.btt.service;

import java.util.List;

import indi.btt.domain.PropertyRepair;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月29日 下午2:22:31 explain:
 */
public interface PropertyRepairService {

	public void addPropertyRepair(PropertyRepair propertyRepair);

	public List<PropertyRepair> queryPropertyRepairAll();

	public List<PropertyRepair> queryPropertyRepairNotCompleted();
}
