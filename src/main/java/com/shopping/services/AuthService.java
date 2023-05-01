package com.shopping.services;

import com.shopping.dto.AuthRequestVo;
import com.shopping.dto.AuthResponseVo;

public interface AuthService {
	
	AuthResponseVo authenticate(AuthRequestVo authrequestVo);

}
