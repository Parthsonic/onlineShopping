package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerShippingAddress {
	
	@Id
	private String customerShippingAddressId;
	
	private Customer customerId;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Date createdDate;
	
	private Date lastModifiedDate;
}
