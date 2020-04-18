package indi.btt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.btt.domain.DailyHealth;
import indi.btt.domain.DailyHealthResult;
import indi.btt.domain.User;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月20日 下午6:03:08 explain:
 */
@Repository
public interface DailyHealthDao {
	public void addDailyHealth(DailyHealth dailyHealth);

	public List<DailyHealth> queryHealthByID(int u_id);

	public List<Float> queryTemperatureByID(int u_id);

	public List<DailyHealthResult> queryUnhealthyYesterday();

	public List<User> queryUnhealthyInfo();

}
