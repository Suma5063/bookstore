package com.example.bookstore;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepo;

    public Book create(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    public Optional<Book> getById(String id) {
        return bookRepo.findById(id);
    }

    public Optional<Book> update(String id, Book book) {
        return bookRepo.findById(id).map(existing -> {
            book.setId(existing.getId());
            return bookRepo.save(book);
        });
    }

    public void delete(String id) {
        bookRepo.deleteById(id);
    }

    public List<Book> getBooksByTitle(String title) {
        return bookRepo.findByTitleIgnoreCase(title);
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepo.findByAuthorIgnoreCase(author);
    }

    public List<Book> getBooksByPriceRange(Double min, Double max) {
        return bookRepo.findByPriceBetween(min, max);
    }

    public List<Book> getBooksSortedBy(String field) {
        return bookRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    }


}

