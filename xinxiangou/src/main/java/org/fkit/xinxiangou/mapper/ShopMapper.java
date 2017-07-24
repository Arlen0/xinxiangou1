package org.fkit.xinxiangou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.xinxiangou.domain.Product;

/**
 * shopMapper接口
 * */
public interface ShopMapper {

	/**
	 * 查询所有购物信息
	 * @return 对象集合
	 * */
	@Select(" select * from product ")
	List<Product> findAll();
	
}
