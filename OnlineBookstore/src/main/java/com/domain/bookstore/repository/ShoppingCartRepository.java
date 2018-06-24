package com.domain.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.domain.bookstore.entities.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}
