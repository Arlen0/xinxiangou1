package org.fkit.xinxiangou.service;

import java.util.List;

import org.fkit.xinxiangou.domain.Collect;


/**
 * shoes�����ӿ�
 * */
public interface CollectService {
	
	/**
	 * ��������Ь��
	 * @return shoes���󼯺�
	 * */

	Collect newcollect(int id,String goodsname, String price, String image, String descripts, String username);

	List<Collect> getAll(String username);

}
