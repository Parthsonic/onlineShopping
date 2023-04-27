package com.shopping.services;

import com.shopping.dto.CustomerRequestVo;
import com.shopping.dto.CustomerResponseVo;

public interface CustomerService {
	CustomerResponseVo create(CustomerRequestVo customerRequestVo);
}
