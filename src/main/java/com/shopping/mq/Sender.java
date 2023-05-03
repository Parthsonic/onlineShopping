package com.shopping.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.shopping.entities.Customer;

@Service
public class Sender {

	@Autowired
	private AmqpTemplate ampAmqpTemplate;
	
	@Value("${javainuse.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;
	
	public void send(Customer customer) {
		System.out.println("sening ::: " + customer.getEmail());
		ampAmqpTemplate.convertAndSend(exchange,routingkey,customer);
		System.out.println("sent ::: " + customer.getEmail());
	}
}
