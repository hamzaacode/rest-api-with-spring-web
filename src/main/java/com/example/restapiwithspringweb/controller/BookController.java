package com.example.restapiwithspringweb.controller;

import com.example.restapiwithspringweb.model.Book;
import com.example.restapiwithspringweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository repository;

    @RequestMapping()
    public Object getBook() {
        new Book("Java").getName();

        return null;
    }

}
