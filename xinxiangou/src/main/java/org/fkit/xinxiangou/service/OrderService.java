package org.fkit.xinxiangou.service;

import java.util.List;
import org.fkit.xinxiangou.domain.Order;
public interface OrderService {
	List<Order> getAll();
	Order removeOrder(int product_id);
	Order findOrder(int product_id);
	Order saveOrder(int product_id);
	Order addOrder(int product_id);
}  
