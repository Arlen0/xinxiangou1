package org.fkit.xinxiangou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.domain.Product;
import org.fkit.xinxiangou.domain.User;
import org.fkit.xinxiangou.domain.Product;

/**
 * BookMapper接口
 * */
public interface ProductMapper {

	/**
	 * 查询所有图书
	 * @param  
	 * @return 图书对象集合
	 * */
	@Select(" select * from product ")
	List<Product> findAll( );
	@Select("select * from product where id=#{id}")
	List<Product> selectByProductId(int id);
	@Select(" select * from product where id=#{id}")
	List<Product> findAll1(int id);
	
	
	
	
	
	
	@Select("insert into product(name,price,descripts,image,image2,image3,image4,stock,sales) values(#{name},#{price},#{descripts},#{image},#{image2},#{image3},#{image4},#{stock},#{sales})")
	Product insertproduct(@Param("name")String name,@Param("price")String price,@Param("descripts")String descripts,@Param("image")String image,
			@Param("image2")String image2,@Param("image3")String image3,@Param("image4")String image4,@Param("stock")String stock,@Param("sales")String sales);
	
	
	
	
	
	 @Delete("delete from product ")
		void clearProduct();
	 
	 
	 @Delete("delete from product where product_id=#{product_id}")
	    void removeProduct(Product product);
	 
	 
	    @Select("select * from product where product_id=#{product_id}")
        Product findWithId(@Param("product_id") int product_id);


}
