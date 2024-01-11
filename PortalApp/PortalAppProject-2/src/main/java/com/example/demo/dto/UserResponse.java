package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {

	private String firstname;
	
	private String lastname;
	
	private String mobileNo;
	
	private String emailid;
 
    private String rolename;
}
