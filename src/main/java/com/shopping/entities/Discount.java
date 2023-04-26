package com.shopping.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Discount {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_discount"
		)
	@SequenceGenerator(name = "seq_discount",
		    allocationSize = 1)
	@Column(name = "discountid")
	private Long discountId;
	
	private String name;
	
	@Column(name = "discountvalue")
	private float discountValue;
	
	private String alias;
	
	@Column(name = "createddate")
	private Date createdDate;
	
	@Column(name = "lastmodifieddate")
	private Date lastmodifiedDate;
	
	@OneToMany(mappedBy = "discountId")
	private List<CustomerOrderDetail> customerOrderDetail;
	
	@OneToMany(mappedBy = "discountId")
	private List<ProductDiscountRel> productDiscountRel;

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(float discountValue) {
		this.discountValue = discountValue;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastmodifiedDate() {
		return lastmodifiedDate;
	}

	public void setLastmodifiedDate(Date lastmodifiedDate) {
		this.lastmodifiedDate = lastmodifiedDate;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", name=" + name + ", discountValue=" + discountValue + ", alias="
				+ alias + ", createdDate=" + createdDate + ", lastmodifiedDate=" + lastmodifiedDate + "]";
	}
}
