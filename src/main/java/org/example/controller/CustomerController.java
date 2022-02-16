package org.example.controller;

import java.util.List;

import org.example.dao.CustomerDAO;
import org.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject the customer dao

	private CustomerDAO customerDAO;

	@Autowired
	public CustomerController(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerDAO.getCustomers();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
}


