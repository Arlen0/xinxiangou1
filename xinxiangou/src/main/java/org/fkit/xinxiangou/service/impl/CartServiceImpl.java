package org.fkit.xinxiangou.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.fkit.xinxiangou.domain.Cart;
import org.fkit.xinxiangou.mapper.CartMapper;
import org.fkit.xinxiangou.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return cartMapper.findAll();
	}
	
	@Override
	public Cart findCart(int product_id) {
		// TODO Auto-generated method stub
		return cartMapper.findWithId(product_id);
	}

	@Override
	public void saveCart(int product_id) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setProduct_id(product_id);
		final int i = 1;
		cart.setCount(i);
		cartMapper.saveCart(cart);
	}
	@Override
	public void addCart(int product_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(product_id);
		cartMapper.addCart(cart);
	}

	@Override
	public void reduceCart(int product_id) {
		// TODO Auto-generated method stub
		
				Cart cart = cartMapper.findWithId(product_id);
				if (cart.getCount() >= 1) {
					cartMapper.reduceCart(cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}

	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		cartMapper.clearCart();
	}

	@Override
	public void removeCart(int product_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(product_id);
		cartMapper.removeCart(cart);
	}

}

