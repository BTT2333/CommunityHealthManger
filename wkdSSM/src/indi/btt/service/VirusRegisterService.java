package indi.btt.service;

import java.util.List;

import indi.btt.domain.VirusRegister;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月28日 下午3:11:52 explain:
 */
public interface VirusRegisterService {

	public void addVirusRegister(VirusRegister virusRegister);

	public VirusRegister queryVirusRegisterByName(String s_name);

	public List<VirusRegister> queryVirusRegisterAll();

}
