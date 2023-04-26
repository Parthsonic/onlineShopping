package com.shopping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class PaymentMode {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_paymentmode"
		)
	@SequenceGenerator(name = "seq_paymentmode",
		    allocationSize = 1)
	private Long paymentModeId;
	
	private String name;
	
	private String alias;

	public Long getPaymentId() {
		return paymentModeId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentModeId = paymentId;
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

	@Override
	public String toString() {
		return "PaymentMode [paymentId=" + paymentModeId + ", name=" + name + ", alias=" + alias + "]";
	}
	
	
}
