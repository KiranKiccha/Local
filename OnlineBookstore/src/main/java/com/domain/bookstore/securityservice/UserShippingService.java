package com.domain.bookstore.securityservice;

import com.domain.bookstore.entities.UserShipping;

public interface UserShippingService {

	UserShipping findById(Long id);

	void removeById(Long id);

}
