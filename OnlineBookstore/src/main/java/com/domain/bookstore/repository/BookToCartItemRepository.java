package com.domain.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.domain.bookstore.entities.BookToCartItem;
import com.domain.bookstore.entities.CartItem;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

	void deleteByCartItem(CartItem cartItem);

}
