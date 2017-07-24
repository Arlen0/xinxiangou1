package org.fkit.xinxiangou.domain;

public class Collect {
    private int id;
    private String goodsname;
    private double price;
    private String image;
    private String descripts;
    private String username;
    
    public Collect() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescripts() {
		return descripts;
	}
	public void setDescripts(String descripts) {
		this.descripts = descripts;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", goodsname=" + goodsname + ",price="
				+ price + ", image=" + image + ",descripts=" + descripts + ",username=" + username +"]";
	}



    
}
