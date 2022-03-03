package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model.Coupon;
import com.example.demo.proxy.CouponGeneratorProxy;
import com.example.demo.proxy.Generator;
import com.example.demo.service.CouponService;

@RestController
public class CouponController {

	private final CouponService couponService;
	private final Environment environment;
	private CouponGeneratorProxy couponGeneratorProxy;

	public CouponController(CouponService couponService, Environment environment,CouponGeneratorProxy couponGeneratorProxy) {

		this.couponService = couponService;
		this.environment = environment;
		this.couponGeneratorProxy=couponGeneratorProxy;
	}

	@GetMapping("/status")
	public String getStatus() {
		System.out.println(environment.toString());
		
		return "coupon service is up and running on port " + environment.getProperty("local.server.port");
	}

	@GetMapping("/coupons/{code}")
	public Coupon findByCouponCode(@PathVariable("code") String coode) {
		return couponService.getCouponByCode(coode);
	}
	@PostMapping("/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon)
	{
		Generator generator=couponGeneratorProxy.generateCoupon();
		coupon.setCode(generator.getCouponCode());
		coupon.setDiscount(generator.getDiscount());
		return couponService.createCoupon(coupon);
	}

}
