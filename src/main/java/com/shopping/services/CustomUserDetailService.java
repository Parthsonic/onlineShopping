package com.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shopping.repositories.StaffRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private StaffRepository staffRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return staffRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
	}

}
