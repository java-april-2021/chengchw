package com.chengchw.Book.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.Book.Repository.BookRepository;
import com.chengchw.Book.models.Book;

@Service
public class BookServices {
    
    // initialize the books variable with values
	  
	  private List<Book> books = new ArrayList(Arrays.asList(
	  
		  new Book("Harry Potter and the Sorcerer's Stone","A boy wizard saving the world", "english", 309), 
		  new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180), 
		  new Book("Moby Dick", "The saga of Captain Ahab", "english", 544), 
		  new Book("Don Quixote", "Life of a retired country gentleman", "english", 150), 
		  new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)));
	
	
	 
	  
	  
	  private final BookRepository bookRepository;
	  public BookServices(BookRepository bookRepo) {
	  
		  this.bookRepository = bookRepo; 
		  
	  }
	  
	  public Book findBookByIndex(int index) {
		  
	        if (index < books.size()){
	        	
	            return books.get(index);
	        }
	        
	        else{
	        	
	            return null;
	        }
	    }
	  
	  public List<Book> allBooks() {
		  
	        return books;
	    }
	  
	  
	  public Book createBook(Book b) {
  
		  return this.bookRepository.save(b); 
		  
	  }
	 
		
//		  private final BookRepository bookRepository;
//		  
//		  public BookServices(BookRepository bookRepo) {
//		  
//		  this.bookRepository = bookRepo; }
//		  
//		  public List<Book> allBooks(){
//		  
//		  return this.bookRepository.findAll(); }
//		  
//		  public Book createBook(Book b) {
//		  
//		  return this.bookRepository.save(b); }
//		  
//		  public Book findBook(Long id) {
//		  
//		  Optional<Book> optionalBook = this.bookRepository.findById(id);
//		  if(optionalBook.isPresent()) {
//		  
//		  return optionalBook.get(); }
//		  
//		  else {
//		  
//		  return null; } }
//		 
}


/*public class BookServices {

	private final BookRepository bookRepository;
	
	public BookServices(BookRepository bookRepo) {
		
		this.bookRepository = bookRepo;
	}
	
	public List<Book> allBooks(){
		
		return this.bookRepository.findAll();
	}
	
	public Book createBook(Book b) {
		
		return this.bookRepository.save(b);
	}
	
	public Book findBook(Long id) {
		
		Optional<Book> optionalBook = this.bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			
			return optionalBook.get();
		}
		
		else {
			
			return null;
		}
	}
	
	
	
}*/
