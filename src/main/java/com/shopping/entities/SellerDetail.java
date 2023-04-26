package com.shopping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class SellerDetail {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_sellerdetail"
			)
	@SequenceGenerator(name = "seq_sellerdetail",
			allocationSize = 1)
	private Long sellerDetialId;
	
	@ManyToOne
	@JoinColumn(name = "sellerId")
	private Seller sellerId;
	
	private String adrees;
	private String city;
	private String state;
	private String coutry;
	
	
}
