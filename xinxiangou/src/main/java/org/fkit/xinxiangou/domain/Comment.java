package org.fkit.xinxiangou.domain;

import java.io.Serializable;

public class Comment implements Serializable{
	private Integer id;	
	private String logistica;
	private String quality;
	private String service;
	private String comments;	
	private String image5;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogistica() {
		return logistica;
	}
	public void setLogistica(String logistica) {
		this.logistica = logistica;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getImage5() {
		return image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", logistica=" + logistica + ", quality="+ quality + ", service=" + service + ", comments= "+ comments +",image5=" + image5 + "]";
	}
}
