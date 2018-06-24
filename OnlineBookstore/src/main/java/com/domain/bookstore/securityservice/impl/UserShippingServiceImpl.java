package com.domain.bookstore.securityservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.bookstore.entities.UserShipping;
import com.domain.bookstore.repository.UserShippingRepository;
import com.domain.bookstore.securityservice.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService {

	@Autowired
	private UserShippingRepository userShippingRepository;
	
	@Override
	public UserShipping findById(Long id) {

		return userShippingRepository.findOne(id);
	}

	@Override
	public void removeById(Long id) {

		userShippingRepository.delete(id);
	}

}
