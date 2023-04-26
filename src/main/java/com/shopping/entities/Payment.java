package com.shopping.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Payment {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_payment"
		)
	@SequenceGenerator(name = "seq_payment",
		    allocationSize = 1)
	@Column(name = "paymentid")
	private Long paymentId;
	
	@GeneratedValue(generator = "payno-generator")
	@GenericGenerator(name = "payno-generator",
	parameters = @Parameter(name="prefix", value="PAYNO"),
	strategy = "com.shopping.generator.CustomPaymentNumberSequenceIdGenerator")
	@Column(name = "paymentnumber")
	private String paymentNumber;
	
	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customerId;
	
	@ManyToOne
	@JoinColumn(name = "custorderid")
	private CustomerOrder coId;
	
	@ManyToOne
	@JoinColumn(name = "paymentmodeid")
	private PaymentMode pmId;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public CustomerOrder getCoId() {
		return coId;
	}

	public void setCoId(CustomerOrder coId) {
		this.coId = coId;
	}

	public PaymentMode getPmId() {
		return pmId;
	}

	public void setPmId(PaymentMode pmId) {
		this.pmId = pmId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentNumber=" + paymentNumber + ", customerId=" + customerId
				+ ", coId=" + coId + ", pmId=" + pmId + "]";
	}
	
	
}
