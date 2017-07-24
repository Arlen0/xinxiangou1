package org.fkit.xinxiangou.service.impl;

import org.fkit.xinxiangou.domain.User;
import org.fkit.xinxiangou.mapper.UserMapper;
import org.fkit.xinxiangou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User�����ӿ�ʵ����
 * @Service("userService")���ڽ���ǰ��ע��Ϊһ��Spring��bean����ΪuserService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * �Զ�ע��UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService�ӿ�login����ʵ��
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}

	@Override
	public User register(String loginname, String password, String username,String phonenumber, String email) {
		// TODO Auto-generated method stub
		return userMapper.insertuser(loginname, password, username,phonenumber, email);
	}

	@Override
	public User findPasswordEmail(String loginname, String email) {
		// TODO Auto-generated method stub
		return userMapper.findPassword(loginname,email);
	}
	@Override
	public void change(String loginname2, String password2, String newpwd) {
		// TODO Auto-generated method stub
		userMapper.changeWithLoginnameAndPassword(loginname2, password2, newpwd);
	}
}
