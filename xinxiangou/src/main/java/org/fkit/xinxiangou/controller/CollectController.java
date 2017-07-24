package org.fkit.xinxiangou.controller;

import java.util.List;


import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.domain.Collect;
import org.fkit.xinxiangou.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ����ͼ�����������
 * */
@Controller
public class CollectController {
	
	/**
	 * �Զ�ע��BookService
	 * */
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;

	/**
	 * ����/main����
	 * */
	@RequestMapping(value="/collection")
	 public String collection(Model model,
			 String username){
		// �������ͼ�鼯��
		List<Collect> collect_list = collectService.getAll(username);
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("collect_list", collect_list);
		// ��ת��mainҳ��
		return "collection";
	}
	@RequestMapping(value="/newcollect")
	 public ModelAndView newcollect(int id,
			 String goodsname,
				String price, 
				String image, 
				String descripts,
				String username,
			   ModelAndView mv ){
		Collect newcollect = collectService.newcollect(id,goodsname, price,image,descripts,username);
		mv.setViewName("product");
		return mv;
	}
}
