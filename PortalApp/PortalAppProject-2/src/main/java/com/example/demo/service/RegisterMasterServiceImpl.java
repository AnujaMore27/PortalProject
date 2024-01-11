package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RegisterMaster;
import com.example.demo.repo.RegisterMasterRepository;

@Service
public class RegisterMasterServiceImpl implements RegisterMasterService
{
	@Autowired
	private RegisterMasterRepository registerMasterRepository;

	@Override
	public void saveRegisterData(RegisterMaster registerMaster) {
	  System.out.println("Check data in service layer:"+" "+registerMaster);
	
	  registerMasterRepository.save(registerMaster);
	}

}
