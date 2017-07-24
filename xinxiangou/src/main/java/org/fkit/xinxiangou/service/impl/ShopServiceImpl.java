package org.fkit.xinxiangou.service.impl;

import java.util.List;

import org.fkit.xinxiangou.domain.Product;
import org.fkit.xinxiangou.mapper.ShopMapper;
import org.fkit.xinxiangou.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("ShopService")
public class ShopServiceImpl implements ShopService {
	
	/**
	 * ×Ô¶¯×¢ÈëShopMapper
	 * */
	@Autowired
	private ShopMapper ShopMapper;

	
	@Transactional(readOnly=true)
	@Override
	public List<Product> getAll() {
		
		return ShopMapper.findAll();
	}

}