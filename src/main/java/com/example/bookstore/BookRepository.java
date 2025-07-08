package com.example.bookstore;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findByTitleIgnoreCase(String title);

    List<Book> findByAuthorIgnoreCase(String author);

    List<Book> findByPriceBetween(Double min, Double max);

}
