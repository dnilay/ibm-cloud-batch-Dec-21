package com.example.demo.service;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.model.CouponGenerator;

@Service
public class GeneratorService {
	
	public CouponGenerator generateCoupon()
	{
		CouponGenerator couponGenerator=new CouponGenerator();
		String[] str=UUID.randomUUID().toString().split("-");
		couponGenerator.setCouponCode(str[0]);
		couponGenerator.setDiscount(new BigDecimal(new Random().nextInt(20)));
		return couponGenerator;
	}

}
