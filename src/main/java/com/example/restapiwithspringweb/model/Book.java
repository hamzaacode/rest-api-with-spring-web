package com.example.restapiwithspringweb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;


@Data
@Entity
@Table(name = "book")
public class Book {


    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column
    private String name;
    @Column
    private String genre;
    @Column
    private String author;

    public Book() {
    }

    public Book(String bookName) {
        this.name = bookName;

    }

}
