package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer prdId;
	private String prdCode;
	private Double prdSal;
	public Product() {
		super();
	}
	public Product(String prdCode, Double prdSal) {
		super();
		this.prdCode = prdCode;
		this.prdSal = prdSal;
	}
	public Product(Integer prdId, String prdCode, Double prdSal) {
		super();
		this.prdId = prdId;
		this.prdCode = prdCode;
		this.prdSal = prdSal;
	}
	public Integer getPrdId() {
		return prdId;
	}
	public void setPrdId(Integer prdId) {
		this.prdId = prdId;
	}
	public String getPrdCode() {
		return prdCode;
	}
	public void setPrdCode(String prdCode) {
		this.prdCode = prdCode;
	}
	public Double getPrdSal() {
		return prdSal;
	}
	public void setPrdSal(Double prdSal) {
		this.prdSal = prdSal;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdCode=" + prdCode + ", prdSal=" + prdSal + "]";
	}
	
	
}
