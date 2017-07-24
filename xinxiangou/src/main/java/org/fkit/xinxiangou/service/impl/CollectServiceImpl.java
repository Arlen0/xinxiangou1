package org.fkit.xinxiangou.service.impl;

import java.util.List;

import org.fkit.xinxiangou.domain.Collect;
import org.fkit.xinxiangou.mapper.CollectMapper;
import org.fkit.xinxiangou.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Book�����ӿ�ʵ����
 * @Service("bookService")���ڽ���ǰ��ע��Ϊһ��Spring��bean����ΪbookService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService {
	
	/**
	 * �Զ�ע��BookMapper
	 * */
	@Autowired
	private CollectMapper collectMapper;

	/**
	 * BookService�ӿ�getAll����ʵ��
	 * @see { BookService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Collect> getAll(String username) {
		
		return collectMapper.findAll(username);
	}

	@Override
	public Collect newcollect(int id,String goodsname, String price, String image, String descripts, String username) {
		// TODO Auto-generated method stub
		return collectMapper.insertcollect(id,goodsname, price,image,descripts,username);
	}

}
