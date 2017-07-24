package org.fkit.xinxiangou.domain;

import java.io.Serializable;

public class Product implements Serializable{
     private int id;
     private String name;
     private String price;
     private String descripts;
     private String image;
     private String image2;
     private String image3;
     private String image4;
     private String stock; //¿â´æ
     private String sales;  //ÏúÁ¿
     int count;

	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescripts() {
		return descripts;
	}
	public void setDescripts(String descripts) {
		this.descripts = descripts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", price="+ price + ", image=" + image + ", image2= "+ image2 +",image3=" + image3 + ",image4=" + image4 + ",descripts=" + descripts + ",stock=" + stock +", sales=" + sales +",count=" + count + "]";
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
     
}
