package org.fkit.xinxiangou.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.fkit.xinxiangou.domain.Comment;
import org.fkit.xinxiangou.domain.Product;
import org.fkit.xinxiangou.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CommentController {

	@Autowired
	@Qualifier("commentService")
	private CommentService commentService;
	
	
	
	
	@RequestMapping(value="/total")
	 public String main (Model model){
		// �������ͼ�鼯��
		List<Comment> comment_list = commentService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("comment_list", comment_list);
		// ��ת��mainҳ��
		return "total";
	}
	
	@RequestMapping(value="/com")
	 public ModelAndView com(
						String logistica,
						String quality, 
						String service, 
						String comments,
						String image5,
					   ModelAndView mv ){
	   Comment com  = commentService.com(logistica, quality, service,comments, image5);
		   if(com != null){
				// ת����loginForm����
				mv.setViewName("comment");
			}
			else{
				// ע��ʧ�ܣ�����ʧ����ʾ��Ϣ������ת��ע��ҳ��
				mv.addObject("message", "��ӳɹ�!");
				mv.setViewName("total");
			}
			return mv;
	}

}