package com.intjava.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intjava.userservice.model.User;
import com.intjava.userservice.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) 
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@PutMapping("/update/{user_id}")
	public User updateUser(@RequestBody User user, @PathVariable("user_id") int id) {
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/delete/{user_id}")
	public String deleteUser(@PathVariable("user_id") int id) {
		 userService.deleteUser(id);
		 return "deleted succesfully.";
	}

}


