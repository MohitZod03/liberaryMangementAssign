package com.example.ibraryManagementSystem.service;

import com.example.ibraryManagementSystem.model.Book;
import com.example.ibraryManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // get all books...
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    // find single books...

    public Book findById(Long id){
        Book book;
        // findById need this exception handling.
        book=bookRepository.findById(id).orElseThrow(()->new RuntimeException("book not found"));
        return book;
    }


    // create the book

    public void  createBook(Book book){
        bookRepository.save(book);
    }

    /// deleted book
    public  void deletedBook(Long id){
        // fist find book
        Book  book=bookRepository.findById(id).orElseThrow(()->new RuntimeException("book not found"));
        bookRepository.deleteById(book.getId());
    }
    // update the book
    public  void updateBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> findByNameContainingIgnoreCase(String name) {
        return bookRepository.findByNameContainingIgnoreCase(name);
    }
}

