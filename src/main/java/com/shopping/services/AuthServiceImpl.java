package com.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.shopping.config.security.JWTUtil;
import com.shopping.dto.AuthRequestVo;
import com.shopping.dto.AuthResponseVo;
import com.shopping.entities.Staff;
import com.shopping.repositories.StaffRepository;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private StaffRepository staffRepo;

	@Override
	public AuthResponseVo authenticate(AuthRequestVo authrequestVo) {
		authManager.authenticate(new UsernamePasswordAuthenticationToken(authrequestVo.getUsername(), authrequestVo.getPassword()));
		Staff staff = staffRepo.findByUsername(authrequestVo.getUsername()).orElseThrow();
		String token = jwtUtil.generateToken(staff);
		AuthResponseVo authResponse = new AuthResponseVo();
		authResponse.setToken(token);
		return authResponse;
	}
	
}
