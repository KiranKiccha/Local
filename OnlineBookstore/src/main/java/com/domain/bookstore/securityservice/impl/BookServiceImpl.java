package com.domain.bookstore.securityservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.bookstore.entities.Book;
import com.domain.bookstore.repository.BookRepository;
import com.domain.bookstore.securityservice.BookService;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	@Override
	public List<Book> findAll() {
		return (List<Book>) bookRepository.findAll();
	}


	@Override
	public Book findOne(Long id) {

		return bookRepository.findOne(id);
	}

}
