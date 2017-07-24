package org.fkit.xinxiangou.service;

import java.util.List;

import org.fkit.xinxiangou.domain.Cart;

public interface CartService {
	List<Cart> getAll();
	Cart findCart(int product_id);
	void saveCart(int product_id);
	void addCart(int product_id);
	void reduceCart(int product_id);
	void removeCart(int product_id);
	void clearCart();
}
