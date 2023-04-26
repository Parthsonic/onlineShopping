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
@Table(name = "customerorder")
public class CustomerOrder {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_customerorder"
		)
	@SequenceGenerator(name = "seq_customerorder",
		    allocationSize = 1)
	@Column(name = "customerorderid")
	private Long customerOrderId;
	
	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customerid;
	
	@Column(name = "totalquantity")
	private int totalQuantity;
	
	@Column(name = "totalprice")
	private Double totalPrice;
	
	@Column(name = "orderdate")
	private Date orderDate;
	
	@Column(name = "deliverydate")
	private Date deliveryDate;
	
	@OneToMany(mappedBy = "coid")
	private List<CustomerOrderDetail> customerOrderDetail;

	public Long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(Long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Customer getCustomerId() {
		return customerid;
	}

	public void setCustomerId(Customer customerId) {
		this.customerid = customerId;
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
		return "CustomerOrder [customerOrderId=" + customerOrderId + ", customerId=" + customerid + ", totalQuantity="
				+ totalQuantity + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + "]";
	}
}
