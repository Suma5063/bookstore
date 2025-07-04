package com.example.bookstore;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookRepository bookRepo;

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable String id) {
        return bookRepo.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable String id, @RequestBody Book book) {
        return bookRepo.findById(id)
            .map(existing -> {
                book.setId(existing.getId());
                return ResponseEntity.ok(bookRepo.save(book));
            }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        bookRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/")
    public String home() {
        return "📚 BookStore API is running! Use /books for endpoints.";
    }
}
