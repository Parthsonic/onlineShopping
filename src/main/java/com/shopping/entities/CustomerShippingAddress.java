package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "customershippingaddress")
public class CustomerShippingAddress {
	
	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_customershippingaddress"
		)
	@SequenceGenerator(name = "seq_customershippingaddress",
		    allocationSize = 1)
	@Column(name = "customershippingaddressid")
	private Long customerShippingAddressId;
	
	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customerId;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	@Column(name = "createddate")
	private Date createdDate;
	
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;

	public Long getCustomerShippingAddressId() {
		return customerShippingAddressId;
	}

	public void setCustomerShippingAddressId(Long customerShippingAddressId) {
		this.customerShippingAddressId = customerShippingAddressId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
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

}
