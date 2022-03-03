package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model.Coupon;
import com.example.demo.service.CouponService;

@RestController
public class CouponController {

	private final CouponService couponService;
	private final Environment environment;

	public CouponController(CouponService couponService, Environment environment) {

		this.couponService = couponService;
		this.environment = environment;
	}

	@GetMapping("/status")
	public String getStatus() {
		return "coupon service is up and running on port " + environment.getProperty("local.server.port");
	}

	@GetMapping("/coupons/{code}")
	public Coupon findByCouponCode(@PathVariable("code") String coode) {
		return couponService.getCouponByCode(coode);
	}

}
