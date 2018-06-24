package com.domain.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.bookstore.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	
	User findByUsername(String username);

	User findByEmail(String email);
}
