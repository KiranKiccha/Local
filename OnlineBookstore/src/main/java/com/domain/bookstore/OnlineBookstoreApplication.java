package com.domain.bookstore;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.bookstore.entities.User;
import com.domain.bookstore.security.Role;
import com.domain.bookstore.security.UserRole;
import com.domain.bookstore.securityservice.UserService;
import com.domain.bookstore.utility.SecurityUtility;





@SpringBootApplication
public class OnlineBookstoreApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineBookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
	User user1 = new User();
			
	user1.setFirstname("Kiran");

	user1.setLastname("Sundaresh");
			
	user1.setUsername("kiran");
			
	user1.setPassword(SecurityUtility.passwordEncoder().encode("abc"));
			
	user1.setEmail("kiran@gmail.com");
			
	Set<UserRole> userRoles = new HashSet<>();
			
	Role role1= new Role();
			
	role1.setRoleId(1);
			
	role1.setName("ROLE_USER");
			
	userRoles.add(new UserRole(user1, role1));

	userService.createUser(user1, userRoles);
		
	}


	
}
