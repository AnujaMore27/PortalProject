package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {

	@PostMapping(value="/login")
	public UserResponse getLoginData(@RequestBody UserRequest userRequest)
	{
		System.out.println("========== In Login Controller=============================================");
    	System.out.println("UserRequest:"+" "+userRequest);
		
    	return null;
		
	}
}
