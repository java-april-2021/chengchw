package com.chengchw.Book.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chengchw.Book.Repository.BookRepository;
import com.chengchw.Book.models.Book;

@Service
public class BookService {
    
    // initialize the books variable with values
	
	private final BookRepository bookRepository;
	
	
	
    private List<Book> books = new ArrayList(Arrays.asList(
            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
            ));
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> allBooksInRepo() {
        return this.bookRepository.findAll();
    }
    
    public Book createBookInRepo(Book b) {
    	
        return this.bookRepository.save(b);
    }
    
    public List<Book> allBooks() {
        return books;
    }
    
    public Book findBookInRepo(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book findBookByIndex(int index) {
        if (index < books.size()){
            return books.get(index);
        }else{
            return null;
        }
    }
    
    public void updateBook(int id, Book book) {
        if (id < books.size()){
        	
            books.set(id, book);
        }
        
        else {
        	
        	books.add(book);
        }
    }
    
    public void destroyBook(int index) {
        if (index < books.size()){
            books.remove(index);
        }
    }
}