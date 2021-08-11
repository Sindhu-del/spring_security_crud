package com.te.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
