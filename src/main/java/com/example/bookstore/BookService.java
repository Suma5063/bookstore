package com.example.bookstore;

import lombok.RequiredArgsConstructor;
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
}

