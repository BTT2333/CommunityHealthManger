package indi.btt.service;

import java.util.List;

import indi.btt.domain.DailyHealth;
import indi.btt.domain.DailyHealthResult;
import indi.btt.domain.User;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月20日 下午5:59:25 explain:
 */
public interface DailyHealthService {

	public void addDailyHealth(DailyHealth dailyHealth);

	public List<DailyHealth> queryHealthByID(int u_id);

	public List<Float> queryTemperatureByID(int u_id);

	public List<DailyHealthResult> queryUnhealthyYesterday();

	public List<User> queryUnhealthyInfo();
}
