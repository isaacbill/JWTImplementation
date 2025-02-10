package com.isaac.security.jwtImplmentation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaac.security.jwtImplmentation.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	 User findByUsername(String username);
}



