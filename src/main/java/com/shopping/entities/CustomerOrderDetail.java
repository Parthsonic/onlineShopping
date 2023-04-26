package com.shopping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CustomerOrderDetail {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_customerorderdetail"
		)
	@SequenceGenerator(name = "seq_customerorderdetail",
		    allocationSize = 1)
	private Long customerOrderDetailId;
	
	@ManyToOne
	private CustomerOrder coId;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product productId;
	
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "discountId")
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
		return coId;
	}

	public void setCustomerOrderId(CustomerOrder customerOrderId) {
		this.coId = customerOrderId;
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
				+ coId + ", productId=" + productId + ", price=" + price + ", discountId=" + discountId
				+ ", totalPrice=" + totalPrice + ", quantity=" + quantity + ", rate=" + rate + "]";
	}
}
