package com.wojciech.grazawski.service;

import java.util.HashMap;

import com.wojciech.grazawski.dto.User;

public class LoginService {

	HashMap<String,String> users = new HashMap<String,String>();
	public LoginService()
	{
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("jguru", "Java Guru");
	}
	 public boolean authenticate(String userId,String password)
	 {
		 if(password == null || password.trim() == "")
		 {
			 return false;
		 }
		 return true;
		
	 }
	 public User getUserDatails(String userId)
	 {
		 User user = new User();
		 user.setUserName(users.get(userId));
		 return user;
		
	 }
}
