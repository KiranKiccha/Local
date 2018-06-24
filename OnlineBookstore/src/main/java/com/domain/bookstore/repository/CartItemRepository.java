package com.domain.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.domain.bookstore.entities.CartItem;
import com.domain.bookstore.entities.ShoppingCart;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{

	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

}
