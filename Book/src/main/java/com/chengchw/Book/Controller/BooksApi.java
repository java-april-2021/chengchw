package com.chengchw.Book.Controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chengchw.Book.Services.BookService;
import com.chengchw.Book.models.Book;

@RestController
public class BooksApi {

	private final BookService bookService;
	
	public BooksApi(BookService bookService) {
		
		this.bookService = bookService;
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.POST)
    public String update(@PathVariable("id") int id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="numberOfPage") int numberOfPage) {
        
		Book updateBook = new Book(title, desc, lang, numberOfPage);
		this.bookService.updateBook(id, updateBook);
        return "/index.jsp";
    }
	
//	@RequestMapping(value="/api/books/{id}", method=RequestMethod.POST)
//    public String update(@PathVariable("id") int id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
//        
//		//Book updateBook = new Book(title, desc, lang, numberOfPage);
//		this.bookService.updateBook(id, book);
//        return "/index.jsp";
//    }
	
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.GET)
    public void destroy(@PathVariable("id") int id) {
        this.bookService.destroyBook(id);
    }

}
