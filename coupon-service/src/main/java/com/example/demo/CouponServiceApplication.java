package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.CouponEntity;
import com.example.demo.repo.CouponRepository;

@SpringBootApplication
public class CouponServiceApplication implements CommandLineRunner{
	private final CouponRepository couponRepository;

	public CouponServiceApplication(CouponRepository couponRepository) {
		
		this.couponRepository = couponRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CouponServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		couponRepository.save(new CouponEntity(1, "code-1", 10.0));
		couponRepository.save(new CouponEntity(2, "code-11", 11.0));
		couponRepository.save(new CouponEntity(3, "code-111", 12.0));
		
	}

}
