package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Coupon;

@RestController
public class MyOrderController {
	
	private final RestTemplate restTemplate;

	public MyOrderController(RestTemplate restTemplate) {
		
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/orders/{code}")
	public Coupon getCoupon(@PathVariable("code")String code)
	{	
		Coupon coupon=restTemplate.getForObject("http://192.168.0.100:8081/coupons/"+code, Coupon.class);
		return coupon;
	}
}
