package org.fkit.xinxiangou.service;

import java.util.List;

import org.fkit.xinxiangou.domain.Comment;


/**
 * User服务层接口
 * */
public interface CommentService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */


	Comment com(String logistica,String quality,String service,String comments,String image5 );

	List <Comment> getAll();


}
