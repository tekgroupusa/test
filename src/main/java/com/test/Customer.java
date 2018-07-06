package com.test;

public class Customer {

	String customerName;
	String customerCity;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public Customer(String customerName, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	
	
	
}
