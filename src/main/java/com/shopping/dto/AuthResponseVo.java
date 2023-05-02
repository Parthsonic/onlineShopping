package com.shopping.dto;

public class AuthResponseVo {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "AuthResponseVo [token=" + token + "]";
	}
	
	
	
}
