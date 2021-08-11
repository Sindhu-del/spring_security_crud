package com.te.springboot.service;

import java.util.List;

import com.te.springboot.model.User;

public interface ServiceInterface {
	
	public User saveUser(User user);
	public List<User> saveUsers(List<User> users);
	public List<User> getUsers();
	public User  getUserById( Long userID);
	public String deleteUser(Long userID);
	public User updateUser(User user) ;

}
