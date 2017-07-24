package org.fkit.xinxiangou.service;
import java.util.List;

import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.domain.Product;




/**
 * Book�����ӿ�
 * */
public interface ProductService {
	
	/**
	 * ��������ͼ��
	 * @return Shop���󼯺�
	 * */
	List <Product> getAll();
	List<Product> getAll1(int id);
	
	
	
	
	Product insertproduct(String name,String price,String descripts,String image,String image2,String image3,String image4,String stock,String sales );

	
	
	
	void removeProduct(int product_id);
	void clearProduct();
	Product findProduct(int product_id);
}
