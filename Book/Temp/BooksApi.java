package com.chengchw.Book.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chengchw.Book.Services.BookServices;
import com.chengchw.Book.models.Book;

@RestController



public class BooksApi {

	private final BookServices bookService;
	public BooksApi(BookServices bookService) {
		
		this.bookService = bookService;
	}
	
	
	@RequestMapping("/api/books")
	public List<Book> index() {
		
		return this.bookService.allBooks();
		
	}
	
	@RequestMapping(value = "/api/books", method = RequestMethod.POST)
	public Book create(@RequestParam(value = "title") String title, 
					   @RequestParam(value = "discription") String discription,
					   @RequestParam(value = "language") String language,
					   @RequestParam(value = "page") Integer numOfPage) {
		
		Book book =  new Book(title,discription,language, numOfPage);
		return bookService.createBook(book);
	}
	
	@RequestMapping("/api/books/{id}")
	public Book show(@PathParam("id") Long id) {
		
		Book book  = this.bookService.findBook(id);
		
		return book;
	}
}
