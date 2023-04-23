package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private String customerId;
	
	private String name;
	
	private String email;
	
	private Long mobileNumber;
	
	private Date createdDate;
	
	private Date lastModifiedDate;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
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
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
}
