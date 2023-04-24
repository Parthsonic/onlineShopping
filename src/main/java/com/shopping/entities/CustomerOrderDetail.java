package com.shopping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerOrderDetail {

	@Id
	private Long customerOrderDetailId;
	
	@ManyToOne
	@JoinColumn
	private CustomerOrder customerOrderId;
	
	@ManyToOne
	@JoinColumn
	private Product productId;
	
	private Double price;
	
	@ManyToOne
	@JoinColumn
	private Discount discountId;
	
	private Double totalPrice;
	
	private int quantity;
	
	private Double rate;

	public Long getCustomerOrderDetailId() {
		return customerOrderDetailId;
	}

	public void setCustomerOrderDetailId(Long customerOrderDetailId) {
		this.customerOrderDetailId = customerOrderDetailId;
	}

	public CustomerOrder getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(CustomerOrder customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Discount getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Discount discountId) {
		this.discountId = discountId;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "CustomerOrderDetail [customerOrderDetailId=" + customerOrderDetailId + ", customerOrderId="
				+ customerOrderId + ", productId=" + productId + ", price=" + price + ", discountId=" + discountId
				+ ", totalPrice=" + totalPrice + ", quantity=" + quantity + ", rate=" + rate + "]";
	}
}
