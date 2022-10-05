package com.stefanie.apipractice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stefanie.apipractice.models.Book;
import com.stefanie.apipractice.repositories.BookRepository;

//+++++++++++++++++FULL CRUD ++++++++++++++

@Service
//the  BookRepository came from the repository
public class BookService {
	
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books -READ ALL
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book - CREATE 
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book -READ ONE 
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
//    //updateBook
    public Book updateBook(Book b) {
        return bookRepository.save(b);    
    }
//    
    //deletteBppk 
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    
    
    
    
    

}
