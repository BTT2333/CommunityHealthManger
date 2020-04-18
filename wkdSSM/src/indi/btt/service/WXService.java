package indi.btt.service;

import java.util.List;

import indi.btt.domain.WXImg;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月12日 下午6:47:04 
* explain:
*/
public interface WXService {
	
	/**
	 * 根据genre查询轮播图
	 * @param genre
	 * @return
	 */
	public List<WXImg> queryImgByGenre(int genre);
}
