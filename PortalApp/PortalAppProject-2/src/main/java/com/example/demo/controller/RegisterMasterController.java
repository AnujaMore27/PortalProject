package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RegisterMaster;
import com.example.demo.service.RegisterMasterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RegisterMasterController 
{
	@Autowired
	private RegisterMasterService registerMasterService;
	
    @PostMapping(value="/register")
	public ResponseEntity<String> getRegisterMasterData(@RequestBody RegisterMaster registerMaster)
	{
    	System.out.println("========== In Controller=============================================");
    	System.out.println("RegisterMaster data:"+" "+registerMaster);
		
    	//send RegisterMaster data from controller to service layer
    	registerMasterService.saveRegisterData(registerMaster);
    	
		return ResponseEntity.ok("successfully registered..");
		
	}
}
