package org.fkit.xinxiangou.service;
import java.util.List;

import org.fkit.xinxiangou.domain.Product;


/**
 * Book�����ӿ�
 * */
public interface ShopService {
	
	/**
	 * ��������ͼ��
	 * @return Shop���󼯺�
	 * */
	List<Product> getAll();


}
