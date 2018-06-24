package com.domain.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.domain.bookstore.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {



	
}
