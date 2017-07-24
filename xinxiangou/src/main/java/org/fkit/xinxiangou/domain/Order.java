package org.fkit.xinxiangou.domain;

import java.util.List;

public class Order {
	private int id;
	private String product_name;
	private String user_name;
	private int count;
	private int product_id;
	private int user_id;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getproduct_id() {
		return product_id;
	}

	public void setproduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", product_name=" + product_name + ", count=" + count + ", product_id=" + product_id + ", user_id="
				+ user_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getproduct_name() {
		return product_name;
	}

	public void setproduct_name(String product_name) {
		this.product_name = product_name;
	}



}


