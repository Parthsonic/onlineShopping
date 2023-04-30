package com.shopping.services;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shopping.dto.CustomerRequestVo;
import com.shopping.dto.CustomerResponseVo;
import com.shopping.entities.Customer;
import com.shopping.entities.Role;
import com.shopping.entities.Staff;
import com.shopping.repositories.CustomerRepository;
import com.shopping.repositories.RoleRepository;
import com.shopping.repositories.StaffRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private StaffRepository staffRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	@Override
	public CustomerResponseVo create(CustomerRequestVo customerRequestVo) {
		// TODO Auto-generated method stub
		CustomerResponseVo customerResponseVo = new CustomerResponseVo();
		Staff staff = new Staff();
		staff.setUsername(customerRequestVo.getCustomer().getEmail());
		staff.setPassword(encoder.encode(customerRequestVo.getPassword()));
		staff.setCreateDate(new Date());
		staff.setLastModifiedDate(new Date());
		Set<Role> role = roleRepo.findByName(customerRequestVo.getRole());
		staff.setRole(role);
		Customer customer =  customerRepo.save(customerRequestVo.getCustomer());
		staff = staffRepo.save(staff);
		customerResponseVo.setCustomer(customer);
		customerResponseVo.setRole(role);
		customerResponseVo.setStaff(staff);
		return customerResponseVo;
	}

}
