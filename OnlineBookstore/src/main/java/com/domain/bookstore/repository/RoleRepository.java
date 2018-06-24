package com.domain.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.domain.bookstore.security.Role;

public interface RoleRepository  extends CrudRepository<Role,Long>{

	Role findByName(String name);
}
