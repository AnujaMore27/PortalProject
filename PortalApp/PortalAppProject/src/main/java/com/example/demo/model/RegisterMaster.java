package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String firstName;
  
  private String lastName;
  
  private String emailid;
  
  private String mobileNo;
  
  private String country;
  
  private String password;
  
  private String repeatPassword;

}
