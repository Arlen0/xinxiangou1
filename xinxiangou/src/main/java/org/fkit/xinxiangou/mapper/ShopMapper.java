package org.fkit.xinxiangou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.xinxiangou.domain.Product;

/**
 * shopMapper�ӿ�
 * */
public interface ShopMapper {

	/**
	 * ��ѯ���й�����Ϣ
	 * @return ���󼯺�
	 * */
	@Select(" select * from product ")
	List<Product> findAll();
	
}
