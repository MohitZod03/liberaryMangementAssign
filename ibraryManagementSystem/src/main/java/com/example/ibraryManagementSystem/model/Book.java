package com.example.ibraryManagementSystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn" , length = 50, nullable = false,unique = true)
    private String isbn;

    @Column(name = "name" , length = 50, nullable = false)
    private String name;

    @Column(name = "description",length = 250,nullable = false)
    private String description;

    // constructor
    public Book(String isbn, String name, String description) {
        this.isbn = isbn;
        this.name = name;
        this.description = description;
    }

}
