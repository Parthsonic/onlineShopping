package com.shopping.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entities.Customer;
import com.shopping.repositories.CustomerRepository;
import com.shopping.services.CustomerService;


@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQController {
	
	@Autowired
	Sender sender;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/sendcustomer")
	public ResponseEntity<String> sendCustomer(@RequestParam("email") String email){
		Customer customer = customerRepository.findByEmail(email).orElseThrow();
		System.out.println("sending in controller");
		sender.send(customer);
		return new ResponseEntity<>("Message Sent Successfully !!! ",HttpStatus.OK);
	}
	
}
