package com.intjava.userservice.model.mapper;

import com.intjava.userservice.dto.UserRequest;
import com.intjava.userservice.model.User;

public class UserMapper 
{
	public static UserRequest userRequest(User user) 
	{
		return new UserRequest()
				.setId(user.getId())
				.setUsername(user.getUsername())
				.setFull_name(user.getFull_name())
				.setEmail(user.getEmail())
				.setAge(user.getAge());

	}
}
