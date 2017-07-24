package org.fkit.xinxiangou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.xinxiangou.domain.Cart;

public interface CartMapper {
	    
	@Select("select * from cart")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "product_id", property = "product", many = @Many(select = "org.fkit.xinxiangou.mapper.ProductMapper.selectByProductId", fetchType = FetchType.LAZY)),		
		@Result(column = "count", property = "count"), @Result(column = "product_id", property = "product_id")})
	List<Cart> findAll();
	
	    //加入购物车
	    @Insert("insert into cart(product_id,count) values(#{product_id},#{count})")
		@Options(useGeneratedKeys = true, keyProperty = "id")
	    void saveCart(Cart cart);
         //通过ID寻找书
	    @Select("select * from cart where product_id=#{product_id}")
		@Results({ @Result(id = true, column = "id", property = "id"),
				@Result(column = "product_id", property = "product", many = @Many(select = "org.fkit.xinxiangou.mapper.ProductMapper.selectByProductId", fetchType = FetchType.LAZY)),				
				@Result(column = "count", property = "count"), @Result(column = "product_id", property = "product_id") })
	    Cart findWithId(@Param("product_id") int product_id);
        //增加书籍数量
	    @Update("update cart set count=count+1 where product_id=#{product_id}")
	    void addCart(Cart cart);
        //清空购物车
	    @Delete("delete from cart ")
		void clearCart();
	    //减少购物车商品数量
	    @Update("update cart set count=count-1 where product_id=#{product_id}")
	    void reduceCart(Cart cart);
	    //删除商品
	    @Delete("delete from cart where product_id=#{product_id}")
	    void removeCart(Cart cart);


}

