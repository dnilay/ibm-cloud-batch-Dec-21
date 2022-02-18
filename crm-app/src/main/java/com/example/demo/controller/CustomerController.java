package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repo.CustomerRepository;

@Controller
public class CustomerController {

	private final CustomerRepository customerRepository;

	public CustomerController(CustomerRepository customerRepository) {

		this.customerRepository = customerRepository;
	}

	@GetMapping("/")
	public String displayAllCustomers(Model theModel) {
		theModel.addAttribute("customers", customerRepository.getAllCustomer());
		return "list-customers";
	}

}
