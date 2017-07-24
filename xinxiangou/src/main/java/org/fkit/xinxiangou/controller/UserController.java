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
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	/**
	 * 处理/login请求
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
				// 转发到loginForm请求
				mv.setViewName("loginForm");
			}
			else{
				// 注册失败，设置失败提示信息，并跳转到注册页面
				mv.addObject("message", "注册成功，请登录!");
				mv.setViewName("home");
			}
			return mv;
	 }
	@RequestMapping(value="/login" )
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setViewName("home");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
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
			url.append("您的密码是："+user.getPassword()+"");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com ");
			sendemail.setAuthentication("wdz15162185378@163.com","wdz1234");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("wdz15162185378@163.com");
				sendemail.setSubject("找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			
		//	response.sendRedirect("loginForm");
			System.out.print("您的密码已发送至您的邮箱，请注意查收");
			mv.setViewName("loginForm");
		
		}else{
			
			response.getWriter().println("密码获取失败");
			System.out.print("密码获取失败");
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
					m.addAttribute("Message", "修改成功！");

				}
			else{
				m.addAttribute("Message","账号密码不匹配，修改失败！");
			}
		return x;
	}
	 
}
	
	


	


