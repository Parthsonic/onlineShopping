package com.shopping.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class CustomerCartDetail {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_customercartdetail"
			)
	@SequenceGenerator(name = "seq_customercartdetail",
			allocationSize = 1)
	private Long customerCartDetailId;
	
	private CustomerCart customerCartId;
	
	private int proudctid;
	private double price;
	private double discount;
	private double totalPrice;
	private int quantity;
	private double rate;
}
