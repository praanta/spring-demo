package com.example.springdemo.entity;

public class Product {
	private Integer pId;
	private String pName;
	private String pDesc;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public Product(Integer pId, String pName, String pDesc) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
	}
	
	
}
