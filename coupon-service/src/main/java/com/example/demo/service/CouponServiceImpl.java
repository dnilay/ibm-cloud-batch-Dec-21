package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.model.Coupon;
import com.example.demo.model.repos.CouponRepo;
@Service
public class CouponServiceImpl implements CouponService {
	
	private final CouponRepo couponRepo;
	

	@Autowired
	public CouponServiceImpl(CouponRepo couponRepo) {
		this.couponRepo = couponRepo;
	}


	@Override
	public List<Coupon> getAllCoupons() {
		// TODO Auto-generated method stub
		return couponRepo.findAll();
	}


	@Override
	public Coupon getCouponByCode(String code) {
		// TODO Auto-generated method stub
		return couponRepo.findByCode(code);
	}

}
