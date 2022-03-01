package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Coupon;
import com.example.demo.proxy.CouponProxy;

@RestController
public class MyOrderController {
	
	/*
	 * private final RestTemplate restTemplate;
	 * 
	 * public MyOrderController(RestTemplate restTemplate) {
	 * 
	 * this.restTemplate = restTemplate; }
	 */
	
	private final CouponProxy couponProxy;
	
	
	public MyOrderController(CouponProxy couponProxy) {
		this.couponProxy = couponProxy;
	}


	@GetMapping("/orders/{code}")
	public Coupon getCoupon(@PathVariable("code")String code)
	{	
		
		Coupon coupon=couponProxy.getCouponDetailsByCouponCode(code);
		return coupon;
	}
	@GetMapping("/orders/coupons/status")
	public String getStatusOfCouponService()
	{
		return couponProxy.getStatusOfCouponService();
	}
}
