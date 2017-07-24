package org.fkit.xinxiangou.mapper;



import org.apache.ibatis.annotations.Param;


import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.xinxiangou.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);

	@Select("insert into user(loginname,password,username,phonenumber,email) values(#{loginname},#{password},#{username},#{phonenumber},#{email})")
	User insertuser(@Param("loginname")String loginname,@Param("password")String password,@Param("username")String username,@Param("phonenumber")String phonenumber,
			@Param("email")String email);
	
	@Select("select * from user where loginname=#{loginname} and email=#{email}")
	User findPassword(@Param("loginname")String loginname,@Param("email")String email);

	

	@Update("update user set password=#{newpwd} where loginname = #{loginname2} and password = #{password2}  ")
		void changeWithLoginnameAndPassword(@Param("loginname2")String loginname2,
			@Param("password2") String password2,@Param("newpwd")String newpwd);
}



