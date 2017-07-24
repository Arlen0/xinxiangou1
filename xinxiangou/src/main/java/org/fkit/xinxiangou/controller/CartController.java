package org.fkit.xinxiangou.controller;

import java.util.List;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.domain.User;
import org.fkit.xinxiangou.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.SessionScope;

@Controller
public class CartController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	
	@RequestMapping(value = "/cart")
	public String cart(Model model) {
		
		// �������ͼ�鼯��
		List<Cart> cart_list = cartService.getAll();
		// ��ͼ�鼯����ӵ�model����
		
		model.addAttribute("cart_list", cart_list);
		// ��ת��cartҳ��
		return "cart";
	
	}
	
	@RequestMapping(value = "/save")
	public String save(HttpServletRequest request,Model model) {
		String product_id = request.getParameter("product_id");
		int product_id_ = Integer.parseInt(product_id);
		Cart cart=cartService.findCart(product_id_);
		if (cart == null) {
			cartService.saveCart(product_id_);
		}else {			
			cartService.addCart(product_id_);	
		}
		List<Cart> cart_list = cartService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("cart_list", cart_list);
		// ��ת��cartҳ��
		return "cart";
	}
	//��չ��ﳵ
	@RequestMapping(value = "/clear")
	public String clear(Model model) {
		cartService.clearCart();
		List<Cart> cart_list = cartService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("cart_list", cart_list);
		// ��ת��mainҳ��
		return "cart";

	}
	//�ӹ��ﳵ���������
	@RequestMapping(value="/reduce")
	public String reduce(Model model,HttpServletRequest request){
		String product_id = request.getParameter("product_id");
		int product_id_ = Integer.parseInt(product_id);
		cartService.reduceCart(product_id_);
		List<Cart> cart_list = cartService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("cart_list", cart_list);
		// ��ת��cartҳ��
		return "cart";
	}
	//ȡ�����ﳵ�Ķ���
	@RequestMapping(value="/remove")
	public String remove(Model model,HttpServletRequest request){
		String product_id = request.getParameter("product_id");
		int product_id_ = Integer.parseInt(product_id);
		cartService.removeCart(product_id_);
		List<Cart> cart_list = cartService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("cart_list", cart_list);
		// ��ת��cartҳ��
		return "cart";
	}
	

}
