package com.example.restapiwithspringweb.repository;

import com.example.restapiwithspringweb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
