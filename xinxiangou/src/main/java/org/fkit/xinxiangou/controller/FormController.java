package org.fkit.xinxiangou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */

/**
 * ��̬ҳ����ת������
 * */
@Controller
public class FormController{

	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		// ��̬��תҳ��
		return formName;
	}

}

