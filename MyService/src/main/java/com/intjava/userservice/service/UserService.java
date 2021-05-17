package com.intjava.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.intjava.userservice.model.User;

public interface UserService 
{
	public User createUser(User user);
	
	public List<User> getUsers();

	public User updateUser(int id, User user);

	public void deleteUser(int id);


	

	

}
