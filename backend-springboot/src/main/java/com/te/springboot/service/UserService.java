package com.te.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.te.springboot.exception.ResourceNotFoundException;
import com.te.springboot.model.User;
import com.te.springboot.repo.UserRepo;

@Service
public class UserService implements ServiceInterface {

	
		@Autowired
		private UserRepo repository;

		
		public User saveUser(User user) {
			return repository.save(user);
		}

		public List<User> saveUsers(List<User> users) {
			return repository.saveAll(users);
		}

		public List<User> getUsers() {
			return repository.findAll();
		}

		public User  getUserById( Long userID) {
			return repository.findById(userID).orElseThrow(()-> new  ResourceNotFoundException("user not found"));
		}
		
		public String deleteUser(Long userID) {
			repository.deleteById(userID);
			return "User removed !! " + userID;
		}

		public User updateUser(User user) {
			User existingUser = repository.findById(user.getId()).orElse(null);
			existingUser.setEmail(user.getEmail());
		    existingUser.setFirstName(user.getFirstName());
			return repository.save(existingUser);
		}

		
		
	}

