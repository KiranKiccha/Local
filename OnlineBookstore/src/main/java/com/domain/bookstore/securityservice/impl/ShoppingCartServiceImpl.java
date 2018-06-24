package com.domain.bookstore.securityservice.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.bookstore.entities.CartItem;
import com.domain.bookstore.entities.ShoppingCart;
import com.domain.bookstore.repository.ShoppingCartRepository;
import com.domain.bookstore.securityservice.CartItemService;
import com.domain.bookstore.securityservice.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private CartItemService cartItemService; 
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	@Override
	public ShoppingCart updateShoppingCart(ShoppingCart shoppingCart) {

		BigDecimal cartTotal= new BigDecimal(0);
		
		List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
		
		for (CartItem cartItem : cartItemList) {
			if(cartItem.getBook().getInStockNumber()>0) {
				cartItemService.updateCartItem(cartItem) ;
				cartTotal=cartTotal.add(cartItem.getSubtotal());
			}
		}
		
		shoppingCart.setGrandTotal(cartTotal);
		
		shoppingCartRepository.save(shoppingCart);
		
		return shoppingCart;
	}

}
