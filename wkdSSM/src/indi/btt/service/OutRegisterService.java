package indi.btt.service;

import java.util.List;

import indi.btt.domain.OutRegister;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月23日 下午4:47:50 explain:
 */
public interface OutRegisterService {
	public void addOutRegister(OutRegister outRegister);

	public List<OutRegister> queryOutRegisterByDate(String date, String time);

	public List<OutRegister> queryOutRegisterAll();
}
