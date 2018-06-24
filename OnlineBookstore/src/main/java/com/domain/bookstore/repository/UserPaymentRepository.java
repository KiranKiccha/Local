package com.domain.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.domain.bookstore.entities.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {


}
