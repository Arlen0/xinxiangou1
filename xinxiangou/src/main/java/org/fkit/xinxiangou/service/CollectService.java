package org.fkit.xinxiangou.service;

import java.util.List;

import org.fkit.xinxiangou.domain.Collect;


/**
 * shoes服务层接口
 * */
public interface CollectService {
	
	/**
	 * 查找所有鞋子
	 * @return shoes对象集合
	 * */

	Collect newcollect(int id,String goodsname, String price, String image, String descripts, String username);

	List<Collect> getAll(String username);

}
