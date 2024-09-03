package com.example.ibraryManagementSystem.repository;

import com.example.ibraryManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookRepository extends JpaRepository<Book,Long>{
    List<Book> findByNameContainingIgnoreCase(String name);
}
