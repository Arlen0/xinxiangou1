package org.fkit.xinxiangou.service;

import org.fkit.xinxiangou.domain.Admin;

/**
 * User服务层接口
 * */
public interface AdminService {

	Admin adminlogin(String adminloginname,String adminpassword);
}
