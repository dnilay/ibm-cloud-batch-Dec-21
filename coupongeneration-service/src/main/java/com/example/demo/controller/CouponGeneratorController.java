package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CouponGenerator;
import com.example.demo.service.GeneratorService;
@RestController
public class CouponGeneratorController {
	
	private final GeneratorService generatorService;
	
	public CouponGeneratorController(GeneratorService generatorService) {
	
		this.generatorService = generatorService;
	}

	@GetMapping("/generates")
	public CouponGenerator createCouponGenerator()
	{
		return generatorService.generateCoupon();
	}

}
