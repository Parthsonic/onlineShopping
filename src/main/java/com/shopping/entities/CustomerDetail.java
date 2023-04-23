package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerDetail {
	
	@Id
	private String customerDetailId;
	
	private String customerId;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Date createdDate;
	
	private Date lastModifiedDate;

	public String getCustomerDetailId() {
		return customerDetailId;
	}

	public void setCustomerDetailId(String customerDetailId) {
		this.customerDetailId = customerDetailId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "CustomerDetail [customerDetailId=" + customerDetailId + ", customerId=" + customerId + ", address="
				+ address + ", city=" + city + ", state=" + state + ", country=" + country + ", createdDate="
				+ createdDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
}
