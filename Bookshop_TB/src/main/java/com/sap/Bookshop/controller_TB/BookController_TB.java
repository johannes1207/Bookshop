package com.sap.Bookshop.controller_TB;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sap.Bookshop.model_TB.Book_TB;
import com.sap.Bookshop.repository.BookRepository_TB;
import com.sap.Bookshop.service.BookService_TB;

@RestController
@RequestMapping("/api/v1")
public class BookController_TB {
	
	
	private final BookService_TB bookService_TB;
	private final BookRepository_TB bookRepository_TB;
	
	public BookController_TB(BookService_TB bookService_TB, BookRepository_TB bookRepository_TB) {
		this.bookService_TB = bookService_TB;
		this.bookRepository_TB = bookRepository_TB;
		bookService_TB.save(new Book_TB());
		bookService_TB.save(new Book_TB());
		
	}
	
	@GetMapping(path = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book_TB>> books(){
		return new ResponseEntity<List<Book_TB>>(bookService_TB.getAll(), HttpStatus.OK);
	}
	
	@PutMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book_TB>> saveBook(@RequestBody Book_TB book) {
		return new ResponseEntity<List<Book_TB>>(HttpStatus.OK);
		
	}
	@PostMapping (path= "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity updateBook(@RequestBody Book_TB book) {
		return new ResponseEntity(bookService_TB.updateBook(book), HttpStatus.OK);
	}
	
	@DeleteMapping (path = "/book/{isbn}")
	public ResponseEntity<?> deleteBook(@PathVariable int isbn) {
		bookRepository_TB.deleteById(isbn);
		return null;
		
	}
	@GetMapping(path = "/costumer", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book_TB>> costumer(){
		return new ResponseEntity<List<Book_TB>>(bookRepository_TB.findProjects(), HttpStatus.OK);
	}
	

}
