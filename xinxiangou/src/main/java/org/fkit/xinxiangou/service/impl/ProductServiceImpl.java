package org.fkit.xinxiangou.service.impl;

import java.util.List;

import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.domain.Product;
import org.fkit.xinxiangou.domain.User;
import org.fkit.xinxiangou.mapper.ProductMapper;
import org.fkit.xinxiangou.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	/**
	 * 自动注入BookMapper
	 * */
	@Autowired
	private ProductMapper productMapper;


	@Transactional(readOnly=true)
	@Override
	public List<Product> getAll() {
		
		return productMapper.findAll();
	}
	   public List<Product> getAll1(int id) {
			
			return productMapper.findAll1( id);
		}
	   
	   
	   @Override
		public Product insertproduct(String name,String price,String descripts,String image,String image2,String image3,String image4,String stock,String sales ) {
			// TODO Auto-generated method stub
			return productMapper.insertproduct(name, price, descripts,image,image2,image3,image4 ,stock,sales);
		}
	   
	   
		@Override
		public void clearProduct() {
			// TODO Auto-generated method stub
			productMapper.clearProduct();
		}

		@Override
		public void removeProduct(int product_id) {
			// TODO Auto-generated method stub
			Product product = productMapper.findWithId(product_id);
			productMapper.removeProduct(product);
		}
		@Override
		public Product findProduct(int product_id) {
			// TODO Auto-generated method stub
			return null;
		}


}
