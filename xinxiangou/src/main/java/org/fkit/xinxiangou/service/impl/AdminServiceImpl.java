package org.fkit.xinxiangou.service.impl;

import org.fkit.xinxiangou.domain.Admin;
import org.fkit.xinxiangou.mapper.AdminMapper;
import org.fkit.xinxiangou.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	@Transactional(readOnly=true)
	@Override
	public Admin adminlogin(String adminloginname, String adminpassword) {
		return adminMapper.findWithAdminLoginnameAndAdminPassword(adminloginname, adminpassword);
	}

}
