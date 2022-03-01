package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CouponEntity;
import com.example.demo.repo.CouponRepository;

@RestController
public class CouponController {

	private final CouponRepository couponRepository;
	private final Environment environment;

	public CouponController(CouponRepository couponRepository, Environment environment) {

		this.couponRepository = couponRepository;
		this.environment = environment;
	}

	@GetMapping("/status")
	public String getStatus() {
		return "coupon service is up and running on port " + environment.getProperty("local.server.port");
	}

	@GetMapping("/coupons/{couponCode}")
	public CouponEntity findByCouponCode(@PathVariable("couponCode") String couponCode) {
		return couponRepository.findByCouponCode(couponCode);
	}

}
