package com.shopping.dto;

import com.shopping.entities.Customer;

public class CustomerRequestVo {
	private Customer customer;
	private String password;
	private String role = "Customer";
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "CustomerRequestVo [customer=" + customer + ", password=" + password + ", role=" + role + "]";
	}
}
