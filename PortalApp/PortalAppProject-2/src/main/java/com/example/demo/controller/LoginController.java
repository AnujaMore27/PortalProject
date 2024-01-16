package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.service.LoginService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	//send login data and get UserResponce object as response
	@PostMapping(value="/login")
	public UserResponse getLoginData(@RequestBody UserRequest userRequest)
	{
		System.out.println("========== In Login Controller=============================================");
    	System.out.println("UserRequest:"+" "+userRequest);
		
    	//if we pass uname and password as argument to getLoginData gives error
    	UserResponse userResponce=loginService.getLoginData(userRequest.getUsername(),userRequest.getPassword());
    	
    	System.out.println("=============================================================================");
    	System.out.println("userResponce:"+" "+userResponce);
    	
    	return userResponce;
		
	}
}
