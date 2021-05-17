package com.intjava.userservice.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.intjava.userservice.model.User;

public interface UserRepository extends MongoRepository<User, Integer>
{
	public User findByUsernameAndPassword(String username, String password);

	public User findByUsername(String username);
}
