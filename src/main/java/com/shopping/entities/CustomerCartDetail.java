package com.shopping.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMERCARTDETAIL")
public class CustomerCartDetail {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_customercartdetail"
			)
	@SequenceGenerator(name = "seq_customercartdetail",
			allocationSize = 1)
	@Column(name = "customercartdetailid")
	private Long customerCartDetailId;
		
	private int proudctid;
	private double price;
	private double discount;
	
	@Column(name = "totalprice")
	private double totalPrice;
	private int quantity;
	private double rate;
}
