package com.domain.bookstore.securityservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.bookstore.entities.UserPayment;
import com.domain.bookstore.repository.UserPaymentRepository;
import com.domain.bookstore.securityservice.UserPaymentService;

@Service
public class UserPaymmentServiceImpl implements UserPaymentService {

	@Autowired
	private UserPaymentRepository userPaymentRepository;
	
	@Override
	public UserPayment findById(Long id) {

		return userPaymentRepository.findOne(id);
	}

	@Override
	public void removeById(Long id) {

		userPaymentRepository.delete(id);
	}

}
