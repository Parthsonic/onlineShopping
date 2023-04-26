package com.shopping.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "paymentmode")
public class PaymentMode {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "seq_paymentmode"
		)
	@SequenceGenerator(name = "seq_paymentmode",
		    allocationSize = 1)
	@Column(name = "paymentmodeid")
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
