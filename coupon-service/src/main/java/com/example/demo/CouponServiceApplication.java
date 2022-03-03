package com.example.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.model.Coupon;
import com.example.demo.model.repos.CouponRepo;

@SpringBootApplication
public class CouponServiceApplication implements CommandLineRunner {
	private final CouponRepo couponRepo;

	public CouponServiceApplication(CouponRepo couponRepo) {

		this.couponRepo = couponRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(CouponServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		couponRepo.save(new Coupon(1L, "CODE-A", new BigDecimal(10), "10-May-2022"));
		couponRepo.save(new Coupon(2L, "CODE-B", new BigDecimal(11), "11-May-2022"));
		couponRepo.save(new Coupon(3L, "CODE-C", new BigDecimal(12), "12-May-2022"));

	}

}
