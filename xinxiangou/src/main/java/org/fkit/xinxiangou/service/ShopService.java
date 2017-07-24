package org.fkit.xinxiangou.service;
import java.util.List;

import org.fkit.xinxiangou.domain.Product;


/**
 * Book服务层接口
 * */
public interface ShopService {
	
	/**
	 * 查找所有图书
	 * @return Shop对象集合
	 * */
	List<Product> getAll();


}
