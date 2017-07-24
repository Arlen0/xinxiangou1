package org.fkit.xinxiangou.controller;

import javax.servlet.http.HttpSession;

import org.fkit.xinxiangou.domain.Admin;
import org.fkit.xinxiangou.domain.User;
import org.fkit.xinxiangou.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdminController {
	/**
	 * �Զ�ע��UserService
	 * */
	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;
	@RequestMapping(value="/adminlogin" )
	 public ModelAndView adminlogin(
			 String adminloginname,String adminpassword,
			 ModelAndView mv,
			 HttpSession session){
		// ���ݵ�¼������������û����ж��û���¼
		Admin admin = adminService.adminlogin(adminloginname, adminpassword);
		if(admin != null){
			// ��¼�ɹ�����user�������õ�HttpSession���÷�Χ��
			session.setAttribute("admin", admin);
			// ת����main����
			mv.setView(new RedirectView("/xinxiangou/add"));
		}else{
			// ��¼ʧ�ܣ�����ʧ����ʾ��Ϣ������ת����¼ҳ��
			mv.addObject("message", "��¼���������������������!");
			mv.setViewName("adminloginForm");
		}
		return mv;
	}
}
