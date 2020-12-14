package com.codersbay.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyFirstController {

    private Map<Long, Book> books = new HashMap<>();

    @GetMapping("/greet/{name}")
    public String greeting(@PathVariable("name") String firstName) {
        return "hello " + firstName + " nice to meet you.";
    }

    @GetMapping("/book/{id}")
    public Book book(@PathVariable("id") Long id) {
        return books.get(id);
    }

    @PostMapping("/book/{id}")
    public void addBook(@PathVariable("id") Long id,
                        @RequestBody Book book) {
        books.put(id, book);
    }

    @PutMapping("/book/{id}")
    public void updateBook(@PathVariable("id") Long id,
                           @RequestBody Book book) {
        books.put(id, book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        books.remove(id);
    }

    @GetMapping("/books")
    public List<Book> showBooks() {
        return new ArrayList<>(this.books.values());
    }

}
