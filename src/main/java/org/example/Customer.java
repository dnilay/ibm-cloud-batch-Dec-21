package org.example;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;

	public Customer() {

	}

	public Customer(int customerId, String customerName, String customerEmail) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {

		return "Customer ID: " + customerId + " Customer Name: " + customerName + " Customer Email: " + customerEmail;
	}

}
