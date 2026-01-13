package com.library.dea.controller;

import com.library.dea.model.Book;
import com.library.dea.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookService.add(book);
    }

    @GetMapping
    public List<Book> showAll() {
        return bookService.showAll();
    }

    @GetMapping("/{id}")
    public Book showById(@PathVariable Integer id) {
        return bookService.showById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        bookService.deleteBook(id);
    }
}
