package com.example.restapiwithspringweb.repository;

import com.example.restapiwithspringweb.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    BookRepository repository;

    @Test
    void showAllBook() {
        for (Book book : repository.findAll()) {
            System.out.println(book.getName());
        }
    }

    @Test
    void addBooks() {
        repository.save(new Book("Java Design Pattern"));
    }
}