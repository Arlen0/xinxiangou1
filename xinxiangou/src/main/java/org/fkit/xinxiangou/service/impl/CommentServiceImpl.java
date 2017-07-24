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
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	/**
	 * 自动注入UserMapper
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
