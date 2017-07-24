package org.fkit.xinxiangou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.domain.Product;
import org.fkit.xinxiangou.domain.User;
import org.fkit.xinxiangou.service.ProductService;
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
public class ProductController {
	
	/**
	 * �Զ�ע��BookService
	 * */
	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	/**
	 * ����/main����
	 * */
	@RequestMapping(value="/home")
	 public String main (Model model){
		// �������ͼ�鼯��
		List<Product> product_list = productService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("product_list", product_list);
		// ��ת��mainҳ��
		return "home";
	}
	@RequestMapping(value="/product")
	 public String look(int id,
			 Model model){
		// �������ͼ�鼯��
		List<Product> p_list = productService.getAll1(id);
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("p_list", p_list);
		// ��ת��mainҳ��
		return "product";
	}
	
	
	
	
	@RequestMapping(value="/insertproduct")
	 public ModelAndView insertproduct(
						String name,
						String price, 
						String descripts, 
						String image,
						String image2,
						String image3,
						String image4,
						String stock,
						String sales,
					   ModelAndView mv ){
	   Product insertproduct  = productService.insertproduct(name, price,descripts,image,image2,image3,image4,stock,sales);
		   if(insertproduct != null){
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
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/clearproduct")
	public String clearproduct(Model model) {
		productService.clearProduct();
		List<Product> product_list = productService.getAll();
		// ��ͼ�鼯����ӵ�model����
		model.addAttribute("product_list", product_list);
		// ��ת��mainҳ��
		return "add";
		}
		
		@RequestMapping(value="/removeproduct")
		public String removeproduct(Model model,HttpServletRequest request){
			String product_id = request.getParameter("product_id");
			int product_id_ = Integer.parseInt(product_id);
			productService.removeProduct(product_id_);
			List<Product> product_list = productService.getAll();
			// ��ͼ�鼯����ӵ�model����
			model.addAttribute("product_list",product_list);
			// ��ת��cartҳ��
			return "add";
		
		

	}
		@RequestMapping(value="/productManagement")
		 public String productmanagement(Model model){
			// �������ͼ�鼯��
			List<Product> product_list = productService.getAll();
			// ��ͼ�鼯����ӵ�model����
			model.addAttribute("product_list", product_list);
			// ��ת��mainҳ��
			return "productManagement";
		}
}