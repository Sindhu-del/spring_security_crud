package com.te.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.te.springboot.model.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Integer> {

	UserDao findByUsername(String username);
}
