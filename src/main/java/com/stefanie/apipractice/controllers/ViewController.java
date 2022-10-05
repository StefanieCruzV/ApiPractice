package com.stefanie.apipractice.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stefanie.apipractice.models.Book;
import com.stefanie.apipractice.services.BookService;

@Controller
public class ViewController {
	
	 private final BookService bookService;
	    
	    public ViewController(BookService bookService) {
	        this.bookService = bookService;
	    }
	    
	    
	    @GetMapping("/")
	    public String allBooks(Model model) {
	    	List<Book> allbooks= bookService.allBooks();
	    	//lest put books in html!
	    	
	    	model.addAttribute("allbooks", allbooks);
	    	return "index.jsp"	;
	    	}
	    
	    
	    @GetMapping("/book/{num}")
	    public String eachbook(@PathVariable("num") Long num ,Model model) {
	    	Book book= bookService.findBook(num);
	    	//lest put books in html!
	    	
	    	model.addAttribute("book", book);
	    	return "eachbook.jsp"	;
	    	}
//	    
//	    @RequestMapping("/lotto/{num}")
//		  public String lotto(@PathVariable("num") int num){
//				 if (num %2 == 0) {
//					 return "You will take a grand journey in the near future, but be weary of tempting offers" ;
//				 }else {
//					  return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends" ;
//			    }
//				 
//		 }
}
