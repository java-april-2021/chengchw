package com.chengchw.Book.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chengchw.Book.Services.BookService;
import com.chengchw.Book.models.Book;

@Controller
public class BooksController {
    
    private final BookService bookService;
    
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = this.bookService.allBooks();
        model.addAttribute("books", books);
    //list out all the book and add attribute to html model
        
//        for(int i=0; i < books.size(); i++) {
//        	
//        	this.bookService.createBookInRepo(books.get(i));
//        	
//        }
        
        return "books/index.jsp";
        //return "books.jsp";
    }
    
    @RequestMapping("/books/{index}")
    public String findBookByIndex(Model model, @PathVariable("index") int index) {
        Book book = bookService.findBookByIndex(index);
        model.addAttribute("book", book);
        model.addAttribute("index",index);
        
        return "showBook.jsp";
    }
    
    @RequestMapping(path = "/books", method = RequestMethod.POST)
    public String findBook(Model model, @RequestParam("index") int index) {
    	
    	findBookByIndex(model,index);
        
        return "showBook.jsp";
    }
    
//    @RequestMapping(path = "/search", method = RequestMethod.GET)
//    public String UserSearchBookByIndex(Model model, @RequestParam(value = "index") int index) {
//    	
//    	return findBookByIndex(model, index);
//        
//    }
    
    
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
    	
    	return "books/new.jsp";
    }
    
    @RequestMapping(value = "/books/new", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	
    	if(result.hasErrors()) {
    		System.out.println("error");	
    		return "books/new.jsp";
    	}
    	
    	else { 
    		
    		List<Book> books = this.bookService.allBooks();
    		books.add(book);
    		this.bookService.createBookInRepo(book);
    		return "books/new.jsp";
    	}
    	
    }
    
    @RequestMapping("/books/edit/{index}")
    public String editBook(@PathVariable(value = "index") int index, Model model) {
    	
    	Book book = this.bookService.findBookByIndex(index);
    	if (book != null) {
    		
    		model.addAttribute("book",book);
    		model.addAttribute("index",index);
    		return "books/editBook.jsp";
    	}
    	else {
    		
    		return "redirect:/books";
    	}
    	
    }
    
//    @PostMapping("/books/edit/{index}")
//    public String updateBook(@PathVariable(value = "index") int index, @Valid @ModelAttribute("book") Book book, BindingResult result) {
//    	
//    	if (result.hasErrors()) {
//    		
//    		return "books/editBook.jsp";
//    	}
//    	
//    	else {
//    		
//    		this.bookService.updateBook(index, book);
//    		return "redirect:/books";
//    	}
//    	
//    	
//    }
    
//    @RequestMapping(value="/books/delete/{index}")
//    public String destroyBook(@PathVariable("index") int index) {
//        bookService.destroyBook(index);
//        return "redirect:/books";
//    }
}