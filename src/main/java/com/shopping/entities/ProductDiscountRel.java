package com.shopping.entities;

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
@Table(name = "productdiscountrel")
public class ProductDiscountRel {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_productdiscount"
		)
	@SequenceGenerator(name = "seq_productdiscount",
		    allocationSize = 1)
	@Column(name = "productdiscountrelid")
	private Long productDiscountRelId;
	
	@ManyToOne
	@JoinColumn(name = "productid")
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name = "discountid")
	private Discount discountId;

	public Long getProductDiscountRelId() {
		return productDiscountRelId;
	}

	public void setProductDiscountRelId(Long productDiscountRelId) {
		this.productDiscountRelId = productDiscountRelId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Discount getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Discount discountId) {
		this.discountId = discountId;
	}

	@Override
	public String toString() {
		return "ProductDiscountRel [productDiscountRelId=" + productDiscountRelId + ", productId=" + productId
				+ ", discountId=" + discountId + "]";
	}
}
