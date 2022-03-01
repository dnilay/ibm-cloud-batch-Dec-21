package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CouponEntity;
import com.example.demo.repo.CouponRepository;

@RestController
public class CouponController {
	
	private final CouponRepository couponRepository;

	public CouponController(CouponRepository couponRepository) {
		
		this.couponRepository = couponRepository;
	}
	@GetMapping("/coupons/{couponCode}")
	public CouponEntity findByCouponCode(@PathVariable("couponCode") String couponCode)
	{
		return couponRepository.findByCouponCode(couponCode);
	}

}
