package com.actinver.finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actinver.finance.dto.UserDto;
import com.actinver.finance.entity.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser() {
		
		UserDto userDto = new UserDto();
		return userDto.getUser();
	}

}
