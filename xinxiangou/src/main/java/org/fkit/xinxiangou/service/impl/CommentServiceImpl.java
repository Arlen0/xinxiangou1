package org.fkit.xinxiangou.service.impl;

import java.util.List;

import org.fkit.xinxiangou.domain.Comment;

import org.fkit.xinxiangou.mapper.CommentMapper;
import org.fkit.xinxiangou.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User�����ӿ�ʵ����
 * @Service("userService")���ڽ���ǰ��ע��Ϊһ��Spring��bean����ΪuserService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	/**
	 * �Զ�ע��UserMapper
	 * */
	@Autowired
	private CommentMapper commentMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Comment> getAll() {
		
		return commentMapper.findAll();
	}
	



	@Override
	public Comment com(String logistica, String quality, String service,String comments, String image5) {
		// TODO Auto-generated method stub
		return commentMapper.insertcomment(logistica, quality, service,comments, image5);
	}


}
