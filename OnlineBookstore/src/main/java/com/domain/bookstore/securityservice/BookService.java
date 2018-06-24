package com.domain.bookstore.securityservice;

import java.util.List;

import com.domain.bookstore.entities.Book;

public interface BookService {

	List<Book> findAll();

	Book findOne(Long id);
}
