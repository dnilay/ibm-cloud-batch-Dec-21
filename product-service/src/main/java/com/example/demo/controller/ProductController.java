package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.CouponNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.proxy.Coupon;
import com.example.demo.proxy.CouponProxy;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	private final ProductService productService;
	private final CouponProxy couponProxy;
	public ProductController(ProductService productService,CouponProxy couponProxy) {
		this.productService = productService;
		this.couponProxy=couponProxy;
	}
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) throws CouponNotFoundException
	{
		Coupon coupon=couponProxy.getCouponByCode(product.getCouponCode());
		if(coupon==null)
		{
			throw new CouponNotFoundException("code not valid");
		}
		
		BigDecimal price=product.getPrice().subtract(coupon.getDiscount());
		product.setPrice(price);
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
	}
	

}
