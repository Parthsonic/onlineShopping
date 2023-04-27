package com.shopping.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Notification {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_notification"
			)
	@SequenceGenerator(name = "seq_notification",
			allocationSize = 1)
	@Column(name = "notificationid")
	private Long notificationId;
	
	@GeneratedValue(generator = "trans-generator")
	@GenericGenerator(name = "trans-generator",
	parameters = {@Parameter(name="prefix", value="TRN"),@Parameter(name="length", value="6")},
	strategy = "com.shopping.generator.CustomSequenceIdGenerator")
	@Column(name = "transactionnumber")
	private String transactionNumber;
	
	@Column(name = "requestidentifier")
	private String requestIdentifier;
	
	private String email;
	
	@OneToOne
	@JoinColumn(name = "customerorderid")
	private CustomerOrder customerOrder;
	
	private String subject;
	private String body;
	
	
}
