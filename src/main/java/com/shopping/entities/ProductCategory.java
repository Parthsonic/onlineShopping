package com.shopping.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class ProductCategory {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_productcategory"
		)
	@SequenceGenerator(name = "seq_productcategory",
		    allocationSize = 1)
	private Long productCategoryId;
	
	private String name;
	
	private String alias;
	
	private String description;
	
	private Date createdDate;
	
	private Date lastmodifiedDate;
	
	@OneToMany(mappedBy = "categoryId")
	private List<Product> products;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "ProductCategory [productCategoryId=" + productCategoryId + ", name=" + name + ", alias=" + alias
				+ ", description=" + description + ", createdDate=" + createdDate + ", lastmodifiedDate="
				+ lastmodifiedDate + "]";
	}
}
