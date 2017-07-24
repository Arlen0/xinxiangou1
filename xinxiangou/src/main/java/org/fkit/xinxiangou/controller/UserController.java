package org.fkit.xinxiangou.controller;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import org.fkit.xinxiangou.domain.User;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.xinxiangou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
	/**
	 * �Զ�ע��UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	/**
	 * ����/login����
	 * */
	
	@RequestMapping(value="/register")
	 public ModelAndView register(
						String loginname,
						String password, 
						String username, 
						String phonenumber,
						String email,
						
					   ModelAndView mv ){
	   User register  = userService.register(loginname, password,username,phonenumber,email);
		   if(register != null){
				// ת����loginForm����
				mv.setViewName("loginForm");
			}
			else{
				// ע��ʧ�ܣ�����ʧ����ʾ��Ϣ������ת��ע��ҳ��
				mv.addObject("message", "ע��ɹ������¼!");
				mv.setViewName("home");
			}
			return mv;
	 }
	@RequestMapping(value="/login" )
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		// ���ݵ�¼������������û����ж��û���¼
		User user = userService.login(loginname, password);
		if(user != null){
			// ��¼�ɹ�����user�������õ�HttpSession���÷�Χ��
			session.setAttribute("user", user);
			// ת����main����
			mv.setViewName("home");
		}else{
			// ��¼ʧ�ܣ�����ʧ����ʾ��Ϣ������ת����¼ҳ��
			mv.addObject("message", "��¼���������������������!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	@RequestMapping(value="/find")
	 public ModelAndView find(String loginname,String email,ModelAndView mv,HttpSession session,HttpServletResponse response) throws Exception{		
		User user=userService.findPasswordEmail(loginname, email);
		if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("���������ǣ�"+user.getPassword()+"");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder���");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com ");
			sendemail.setAuthentication("wdz15162185378@163.com","wdz1234");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("wdz15162185378@163.com");
				sendemail.setSubject("�һ�����");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("�׳��쳣");
			}
			
		//	response.sendRedirect("loginForm");
			System.out.print("���������ѷ������������䣬��ע�����");
			mv.setViewName("loginForm");
		
		}else{
			
			response.getWriter().println("�����ȡʧ��");
			System.out.print("�����ȡʧ��");
		}	
		return mv;
	}
	
	@RequestMapping("change")
	public String change(
			 String loginname2,String password2,String newpwd,
			 Model m){	

			String x="change";
			User user = userService.login(loginname2, password2);
			if(user != null){
					userService.change(loginname2, password2, newpwd);
					x="loginForm";
					m.addAttribute("Message", "�޸ĳɹ���");

				}
			else{
				m.addAttribute("Message","�˺����벻ƥ�䣬�޸�ʧ�ܣ�");
			}
		return x;
	}
	 
}
	
	


	


