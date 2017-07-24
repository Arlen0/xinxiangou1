package org.fkit.xinxiangou.service;

import org.fkit.xinxiangou.domain.User;

/**
 * User�����ӿ�
 * */
public interface UserService {
	
	/**
	 * �ж��û���¼
	 * @param String loginname
	 * @param String password
	 * @return �ҵ�����User����û���ҵ�����null
	 * */
	User login(String loginname,String password);

	User register(String loginname,String password,String username,String phonenumber,String email );

	User findPasswordEmail(String loginname, String email);
	
	void change(String loginname2,String password2,String newpwd);
	


}
