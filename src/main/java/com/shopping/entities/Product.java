package com.shopping.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Product {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_product"
		)
	@SequenceGenerator(name = "seq_product",
		    allocationSize = 1)
	private Long productId;
	
	private String name;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private ProductCategory categoryId;
	
	private Double price;
	
	private Date createdDate;
	
	private Date lastmodifiedDate;
	
	//private Warehouse warehouseId;
	
	private int quantity;
	
	@OneToMany(mappedBy = "productId")
	private List<CustomerOrderDetail> customerOrderDetail;
	
	@OneToMany(mappedBy = "productId")
	private List<ProductDiscountRel> productDiscountRel;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductCategory getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(ProductCategory categoryId) {
		this.categoryId = categoryId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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

	/*
	 * public Warehouse getWarehouseId() { return warehouseId; }
	 * 
	 * public void setWarehouseId(Warehouse warehouseId) { this.warehouseId =
	 * warehouseId; }
	 */

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", categoryId="
				+ categoryId + ", price=" + price + ", createdDate=" + createdDate + ", lastmodifiedDate="
				+ lastmodifiedDate + /* ", warehouseId=" + warehouseId + */", quantity=" + quantity + "]";
	}
}
