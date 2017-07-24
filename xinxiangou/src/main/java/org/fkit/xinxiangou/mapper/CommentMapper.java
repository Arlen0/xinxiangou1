package org.fkit.xinxiangou.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Select;
import org.fkit.xinxiangou.domain.Comment;
import org.fkit.xinxiangou.domain.Product;

/**
 * UserMapper½Ó¿Ú
 * */
public interface CommentMapper {
	


	@Select("insert into comment(logistica,quality,service,comments,image5) values(#{logistica},#{quality},#{service},#{comments},#{image5})")
	Comment insertcomment(@Param("logistica")String logistica,@Param("quality")String quality,@Param("service")String service,@Param("comments")String comments,
			@Param("image5")String image5);
	
	
	@Select(" select * from comment ")
	List<Comment> findAll( );

}