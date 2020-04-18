package indi.btt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.btt.dao.WXDao;
import indi.btt.domain.WXImg;
import indi.btt.service.WXService;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月12日 下午6:48:14 
* explain:
*/
@Service
public class WXServiceImpl implements WXService {

	
	@Autowired
	WXDao wxDao;
	@Override
	public List<WXImg> queryImgByGenre(int genre) {
		return wxDao.queryImgByGenre(genre);
	}

}
