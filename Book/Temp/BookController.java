package com.chengchw.Book.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chengchw.Book.Services.BookServices;
import com.chengchw.Book.models.Book;

@Controller
public class BookController {
	
	private final BookServices bookser;
	
	public BookController(BookServices bookservice) {
		
		this.bookser = bookservice;
	}
	
	/*
	 * @RequestMapping("/") public String app() {
	 * 
	 * return "DateTime.jsp"; }
	 */
	
	@RequestMapping("/books")
	public String index(Model model) {
		
		List<Book> books = this.bookser.allBooks();
		model.addAttribute("books",books);
		
		return "index.jsp";
		//return "/books/index.jsp";
	}
	
	
	  @RequestMapping("/books/${index}") 
	  
	  public String findBookByIndex(Model model, @PathVariable("index") int index) {
	  
		  Book book = this.bookser.findBookByIndex(index);
		  
		  model.addAttribute("book", book);
		  return "showBook.jsp"; 
	  
	  }
	 
	  	@RequestMapping("/books/new")
	    public String newBook(@ModelAttribute("book") Book book) {
	        return "/books/new.jsp";
	    }
	    @RequestMapping(value="/books", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/new.jsp";
	        } else {
	        	bookser.createBook(book);
	            return "redirect:/books";
	        }
	    }

}
