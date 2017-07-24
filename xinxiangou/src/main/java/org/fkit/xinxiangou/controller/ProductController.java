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
 * 处理图书请求控制器
 * */
@Controller
public class ProductController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/home")
	 public String main (Model model){
		// 获得所有图书集合
		List<Product> product_list = productService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("product_list", product_list);
		// 跳转到main页面
		return "home";
	}
	@RequestMapping(value="/product")
	 public String look(int id,
			 Model model){
		// 获得所有图书集合
		List<Product> p_list = productService.getAll1(id);
		// 将图书集合添加到model当中
		model.addAttribute("p_list", p_list);
		// 跳转到main页面
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
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/clearproduct")
	public String clearproduct(Model model) {
		productService.clearProduct();
		List<Product> product_list = productService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("product_list", product_list);
		// 跳转到main页面
		return "add";
		}
		
		@RequestMapping(value="/removeproduct")
		public String removeproduct(Model model,HttpServletRequest request){
			String product_id = request.getParameter("product_id");
			int product_id_ = Integer.parseInt(product_id);
			productService.removeProduct(product_id_);
			List<Product> product_list = productService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("product_list",product_list);
			// 跳转到cart页面
			return "add";
		
		

	}
		@RequestMapping(value="/productManagement")
		 public String productmanagement(Model model){
			// 获得所有图书集合
			List<Product> product_list = productService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("product_list", product_list);
			// 跳转到main页面
			return "productManagement";
		}
}