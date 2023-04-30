package com.shopping.dto;

import java.util.Set;

import com.shopping.entities.Customer;
import com.shopping.entities.Role;
import com.shopping.entities.Staff;

public class CustomerResponseVo {
	
	private Customer customer;
	private Staff staff;
	private Set<Role> role;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "CustomerResponseVo [customer=" + customer + ", staff=" + staff + ", role=" + role + "]";
	}
}
