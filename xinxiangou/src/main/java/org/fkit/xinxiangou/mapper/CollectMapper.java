package org.fkit.xinxiangou.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.xinxiangou.domain.Collect;


/**
 * BookMapper接口
 * */
public interface CollectMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from collect where username= #{username}")
	List<Collect> findAll(String username);
	
	@Select("insert into collect(id,goodsname,price,image,descripts,username) values(#{id},#{goodsname},#{price},#{image},#{descripts},#{username})")
	Collect insertcollect(@Param("id")int id,@Param("goodsname")String goodsname,@Param("price")String price,@Param("image")String image,
			@Param("descripts")String descripts,@Param("username")String username);


}
