package com.te.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.model.User;
import com.te.springboot.repo.UserRepo;
import com.te.springboot.service.UserService;


@CrossOrigin(origins="http://localhost:3800")
@RestController
@RequestMapping("api/")
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.getUsers();
		
	}
	@PostMapping("/add")
	public User saveUser( @RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List <User> addUsers(@RequestBody List< User> users){
		return service.saveUsers(users);
	}
	

    @GetMapping("userById/{userID}")
    public User findUserById(@PathVariable Long userID) {
 
        return service.getUserById(userID);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        return service.deleteUser(id);
    }



}
