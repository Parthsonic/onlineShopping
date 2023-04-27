package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.dto.CustomerRequestVo;
import com.shopping.dto.CustomerResponseVo;
import com.shopping.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerSerive;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<CustomerResponseVo> createCustomer(@RequestBody CustomerRequestVo customerRequestVo){
		CustomerResponseVo customerResponseVO =  customerSerive.create(customerRequestVo);
		return new ResponseEntity<CustomerResponseVo>(customerResponseVO,HttpStatus.CREATED) ;
	}
}
