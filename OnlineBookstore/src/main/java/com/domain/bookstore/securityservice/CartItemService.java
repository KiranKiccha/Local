package com.domain.bookstore.securityservice;

import java.util.List;

import com.domain.bookstore.entities.Book;
import com.domain.bookstore.entities.CartItem;
import com.domain.bookstore.entities.ShoppingCart;
import com.domain.bookstore.entities.User;


public interface CartItemService {

	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

	CartItem updateCartItem(CartItem cartItem);

	CartItem addBookToCart(Book book, User user, int qty);

	CartItem findById(Long id);

	void removeCartItem(CartItem cartItem);

}
	