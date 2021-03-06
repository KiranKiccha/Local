package com.domain.bookstore.securityservice.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.bookstore.entities.Book;
import com.domain.bookstore.entities.BookToCartItem;
import com.domain.bookstore.entities.CartItem;
import com.domain.bookstore.entities.ShoppingCart;
import com.domain.bookstore.entities.User;
import com.domain.bookstore.repository.BookToCartItemRepository;
import com.domain.bookstore.repository.CartItemRepository;
import com.domain.bookstore.securityservice.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemRepository cartItemRepository;
	
	@Autowired
	private BookToCartItemRepository bookToCartItemRepository;
	
	@Override
	public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
		return cartItemRepository.findByShoppingCart(shoppingCart);
	}

	@Override
	public CartItem updateCartItem(CartItem cartItem) {

		BigDecimal bigDecimal= new BigDecimal(cartItem.getBook().getOurPrice()).multiply(new BigDecimal(cartItem.getQty()));
		
		 bigDecimal = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);
		 
		 cartItem.setSubtotal(bigDecimal);
		 
		 cartItemRepository.save(cartItem);
		 
		 return cartItem;
	}

	@Override
	public CartItem addBookToCart(Book book, User user, int qty) {

		List<CartItem> cartItemList = findByShoppingCart(user.getShoppingCart());
		
		for(CartItem cartItem:cartItemList) {
			if(book.getId()==cartItem.getBook().getId()) {
				cartItem.setQty(cartItem.getQty()+qty);
				cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
				cartItemRepository.save(cartItem);
				return cartItem;
			}
		}
		
		CartItem cartItem = new CartItem();
		cartItem.setShoppingCart(user.getShoppingCart());
		cartItem.setBook(book);
		cartItem.setQty(qty);
		cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
		cartItem=cartItemRepository.save(cartItem);
		
		BookToCartItem  bookToCartItem = new BookToCartItem();
		
		bookToCartItem.setBook(book);
		bookToCartItem.setCartItem(cartItem);
		bookToCartItemRepository.save(bookToCartItem);
		
		return cartItem;
		
	}

	@Override
	public CartItem findById(Long id) {

		return cartItemRepository.findOne(id);
	}

	@Override
	public void removeCartItem(CartItem cartItem) {

		bookToCartItemRepository.deleteByCartItem(cartItem);
		cartItemRepository.delete(cartItem);
	}

}
