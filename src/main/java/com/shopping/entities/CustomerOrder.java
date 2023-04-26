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
public class CustomerOrder {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_customerorder"
		)
	@SequenceGenerator(name = "seq_customerorder",
		    allocationSize = 1)
	private Long customerOrderId;
	
	@ManyToOne
	private Customer customerId;
	
	private int totalQuantity;
	
	private Double totalPrice;
	
	private Date orderDate;
	
	private Date deliveryDate;
	
	@OneToMany(mappedBy = "coId")
	private List<CustomerOrderDetail> customerOrderDetail;

	public Long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(Long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
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
		return "CustomerOrder [customerOrderId=" + customerOrderId + ", customerId=" + customerId + ", totalQuantity="
				+ totalQuantity + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + "]";
	}
}
