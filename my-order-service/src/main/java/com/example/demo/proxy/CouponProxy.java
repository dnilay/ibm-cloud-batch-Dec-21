package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Coupon;

@FeignClient("COUPON-SERVICE-WS")
public interface CouponProxy {
	@GetMapping("/coupons/{couponCode}")
	public Coupon getCouponDetailsByCouponCode(@PathVariable("couponCode") String couponId);
	@GetMapping("/status")
	public String getStatusOfCouponService();

}
