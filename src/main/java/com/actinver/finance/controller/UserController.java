package com.actinver.finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actinver.finance.dto.UserDto;
import com.actinver.finance.entity.UserEntity;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public UserEntity getUser() {
		
		UserDto userDto = new UserDto();
		return userDto.getUser();
	}

}
