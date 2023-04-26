package com.shopping.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMERCART")
public class CustomerCart {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_customercart"
			)
	@SequenceGenerator(name = "seq_customercart",
			allocationSize = 1)
	@Column(name = "customercartid")
	private Long customerCartId;
	
	@OneToMany
	@JoinColumn(name = "customercartid")
	private List<CustomerCartDetail> customerDetailId;
	
	@Column(name = "totalquantity")
	private int totalQuantity;
	
	@Column(name = "totalprice")
	private double totalPrice;
	
	@Column(name = "orderdate")
	private Date orderDate;
	
	@Column(name = "deliverydate")
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
