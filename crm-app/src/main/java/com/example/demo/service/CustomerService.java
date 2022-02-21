package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	public Customer getCustomer(Integer id);
	
	public void deleteCustomer(Integer id);

}
