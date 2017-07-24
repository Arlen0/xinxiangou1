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
import org.fkit.xinxiangou.domain.Order;

public interface OrderMapper {
    
	@Select("select * from `order`")
	List<Order> findAll();
	//加入订单 
    @Insert("insert into `order`(product_id,count) values(#{product_id},#{count})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveOrder(Order order);
  //通过ID寻找书
    @Select("select * from `order` where product_id=#{product_id}")
	Order findWithId(@Param("product_id") int product_id);
  //增加书籍数量
    @Update("update `order` set count=count+1 where product_id=#{product_id}")
	void addOrder(Order order);
    //删除商品
    @Delete("delete from `order` where product_id=#{product_id}")
	void removeOrder(Order order);
}
