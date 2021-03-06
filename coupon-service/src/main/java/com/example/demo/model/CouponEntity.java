package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class CouponEntity {
	@Id
	private Integer couponId;
	private String couponCode;
	private Double discount;
	
	
	public CouponEntity() {
		super();
	}


	public CouponEntity(Integer couponId, String couponCode, Double discount) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.discount = discount;
	}


	public Integer getCouponId() {
		return couponId;
	}


	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}


	public String getCouponCode() {
		return couponCode;
	}


	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	

}
