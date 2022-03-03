package com.example.demo.service;

import java.util.List;

import com.example.demo.model.model.Coupon;

public interface CouponService {
	
	public List<Coupon> getAllCoupons();
	public Coupon getCouponByCode(String code);
	
	public Coupon createCoupon(Coupon coupon);

}
