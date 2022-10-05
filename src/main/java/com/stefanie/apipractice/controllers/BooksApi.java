package com.stefanie.apipractice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stefanie.apipractice.models.Book;
import com.stefanie.apipractice.services.BookService;

@RestController
public class BooksApi {
	//DEPENDENCY INJECTION
    private final BookService bookService;
    
    //CONSTRUCTOR
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(	@RequestParam(value="title") String title, 
			    		@RequestParam(value="description") String desc,
			    		@RequestParam(value="language") String lang, 
			    		@RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
//    // ================ASIGNAMET=============
 // other methods removed for brevity
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages) {
    	Book book = new Book(title, desc, lang, numOfPages);
    	book.setId(id);
    	Book bookInDB = bookService.findBook(id);
    	System.out.println(bookInDB.getId() + " " + bookInDB.getTitle());
        book = bookService.updateBook(book);
        System.out.println(book.getId() + " " + book.getTitle());
        return book;
 }
    
    @RequestMapping(value="/api/books/delete/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
    
    
}