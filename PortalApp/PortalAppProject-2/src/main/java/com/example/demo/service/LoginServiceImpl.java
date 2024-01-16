package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.UserResponse;
import com.example.demo.model.RegisterMaster;
import com.example.demo.repo.RegisterMasterRepository;

@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	private RegisterMasterRepository RegisterMasterRepository;

	@Override
	public UserResponse getLoginData(String uname, String password) 
	{
		UserResponse userResponse=new UserResponse();
		
		RegisterMaster registerMaster=RegisterMasterRepository.findByEmailidAndPassword(uname, password);
		
		//if we provide wrong uname:emailid and password to findByEmailidAndPassword()
		String role= "";  //throws NullPointerException
		
//		if(registerMaster.getRole()!=null)
//		{
//		  userResponse.setRolename(role);	
//		}
//		  
	    if(registerMaster!=null && role.isEmpty())
		{	
		  //set userResponse object as response	
		  userResponse.setFirstname(registerMaster.getFirstname());
		  userResponse.setLastname(registerMaster.getLastname());
		  userResponse.setMobileNo(registerMaster.getMobileNo());
		  userResponse.setEmailid(registerMaster.getEmailid());
		  //userResponse.setRolename();
		
		  if(registerMaster.getRole()!=null)
		  {
			  role=registerMaster.getRole().getRolename();
			  userResponse.setRole(role);
			  	
		  }
			
		   return userResponse;
	    }
	    
	    else{
	   	  return null;
	    }
	}
}
