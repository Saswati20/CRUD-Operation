package com.intjava.userservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.intjava.userservice.model.User;
import com.intjava.userservice.model.repository.UserRepository;
import com.intjava.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) 
	{
		return userRepository.save(user);
	}
	
	@Override
	public List<User> getUsers() 
	{
		return userRepository.findAll();
	}

	@Override
	public User updateUser(int id, User user) 
	{
		Optional<User> findById = userRepository.findById(id);
		if (findById.isPresent()) {
			User userEntity = findById.get();
			if (user.getUsername() != null && !user.getUsername().isEmpty())
				userEntity.setUsername(user.getUsername());
			if (user.getFull_name() != null && !user.getFull_name().isEmpty())
				userEntity.setFull_name(user.getFull_name());
			if (user.getEmail() != null && !user.getEmail().isEmpty())
				userEntity.setEmail(user.getEmail());
			if (user.getAge() != null)
				userEntity.setAge(user.getAge());
			if (user.getPassword() != null)
				userEntity.setPassword(user.getPassword());
			return userRepository.save(userEntity);
		}
		return null;
	}

	@Override
	public void deleteUser(int id) 
	{
		userRepository.deleteById(id);
	}


	

	
	

	
}
