package com.shopping.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Seller {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_seller"
			)
	@SequenceGenerator(name = "seq_seller",
			allocationSize = 1)
	@Column(name = "sellerid")
	private Long sellerId;
	
	private String name;
	
	private String email;
	
	@Column(name = "mobilenumber")
	private String mobileNumber;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	@Column(name = "createddate")
	private Date createdDate;
	
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;

	@OneToMany
	@JoinTable(name = "sellerwarehouserel",
			joinColumns = 
        { @JoinColumn(name = "sellerid", referencedColumnName = "sellerId") },
      inverseJoinColumns = 
        { @JoinColumn(name = "warehouseid", referencedColumnName = "warehouseId") }
        )
	private List<Warehouse> warehouse;
	
	@OneToMany
	@JoinTable(name = "sellerproductrel",
		joinColumns = 
		{ @JoinColumn(name = "sellerid", referencedColumnName = "sellerId") },
		inverseJoinColumns = 
		{ @JoinColumn(name = "productid", referencedColumnName = "productId") }
		)
	private List<Product> product;
	
	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
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

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}

	
	
	
}
