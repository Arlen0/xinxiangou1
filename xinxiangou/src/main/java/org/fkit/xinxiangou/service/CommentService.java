package org.fkit.xinxiangou.service;

import java.util.List;

import org.fkit.xinxiangou.domain.Comment;


/**
 * User�����ӿ�
 * */
public interface CommentService {
	
	/**
	 * �ж��û���¼
	 * @param String loginname
	 * @param String password
	 * @return �ҵ�����User����û���ҵ�����null
	 * */


	Comment com(String logistica,String quality,String service,String comments,String image5 );

	List <Comment> getAll();


}
