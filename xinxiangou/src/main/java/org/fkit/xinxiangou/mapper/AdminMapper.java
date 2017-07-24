package org.fkit.xinxiangou.mapper;



import org.apache.ibatis.annotations.Param;


import org.apache.ibatis.annotations.Select;
import org.fkit.xinxiangou.domain.Admin;

/**
 * UserMapper�ӿ�
 * */
public interface AdminMapper {

	@Select("select * from admin where adminloginname = #{adminloginname} and adminpassword = #{adminpassword}")
	Admin findWithAdminLoginnameAndAdminPassword(@Param("adminloginname")String adminloginname,
			@Param("adminpassword") String adminpassword);
}
