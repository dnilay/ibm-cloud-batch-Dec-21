package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repos.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService{
	private final ProductRepo productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

}
