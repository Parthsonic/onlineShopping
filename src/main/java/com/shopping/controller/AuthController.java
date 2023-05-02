package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.dto.AuthRequestVo;
import com.shopping.dto.AuthResponseVo;
import com.shopping.services.AuthService;

@RestController
@RequestMapping("/authentication")
public class AuthController {
	
	@Autowired
	private AuthService authService;

	@PostMapping("/token")
	public ResponseEntity<AuthResponseVo> getAuth(@RequestBody AuthRequestVo authRequest) {
		AuthResponseVo authResponse =authService.authenticate(authRequest);
		return new ResponseEntity<>(authResponse,HttpStatus.OK);
	}
}
