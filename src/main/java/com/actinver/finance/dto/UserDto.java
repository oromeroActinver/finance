package com.actinver.finance.dto;

import com.actinver.finance.entity.UserEntity;

public class UserDto {
	
	public UserEntity getUser() {
		
		UserEntity user = new UserEntity();
		user.setIdUser(0001);
		user.setName("Orlando");
		user.setUser("oromero");
		user.setPasword("9909");
		user.setTypeUser("admin");
		
		return user;
		
	}

}
