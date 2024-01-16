package com.example.demo.service;

import com.example.demo.dto.UserResponse;

public interface LoginService {

	UserResponse getLoginData(String uname,String password);
	
}
