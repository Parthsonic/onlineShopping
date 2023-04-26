package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class CustomerCart {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_customercart"
			)
	@SequenceGenerator(name = "seq_customercart",
			allocationSize = 1)
	private Long customerCartId;
	
	private int totalQuantity;
	private double totalPrice;
	private Date orderDate;
	private Date deliveryDate;
	public Long getCustomerCartId() {
		return customerCartId;
	}
	public void setCustomerCartId(Long customerCartId) {
		this.customerCartId = customerCartId;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	@Override
	public String toString() {
		return "CustomerCart [customerCartId=" + customerCartId + ", totalQuantity=" + totalQuantity + ", totalPrice="
				+ totalPrice + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + "]";
	}
	
	
}
