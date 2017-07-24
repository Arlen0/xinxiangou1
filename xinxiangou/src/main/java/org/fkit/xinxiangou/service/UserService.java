package org.fkit.xinxiangou.service;

import org.fkit.xinxiangou.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String loginname,String password);

	User register(String loginname,String password,String username,String phonenumber,String email );

	User findPasswordEmail(String loginname, String email);
	
	void change(String loginname2,String password2,String newpwd);
	


}
