package com.actinver.finance.dto;

import com.actinver.finance.entity.User;

public class UserDto {
	
	public User getUser() {
		
		User user = new User();
		user.setIdUser(0001);
		user.setName("Orlando");
		user.setUser("oromero");
		user.setPasword("9909");
		user.setTypeUser("admin");
		
		return user;
		
	}

}
