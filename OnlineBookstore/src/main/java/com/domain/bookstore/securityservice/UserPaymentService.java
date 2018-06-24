package com.domain.bookstore.securityservice;

import com.domain.bookstore.entities.UserPayment;

public interface UserPaymentService {

	UserPayment findById(Long creditCardId);

	void removeById(Long id);

}
