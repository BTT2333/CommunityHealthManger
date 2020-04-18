package indi.btt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.btt.domain.WXImg;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月12日 下午6:41:10 
* explain:
*/
@Repository
public interface WXDao {
	
	/**
	 * 根据genre查询轮播图
	 * @param genre
	 * @return
	 */
	public List<WXImg> queryImgByGenre(int genre);
}
