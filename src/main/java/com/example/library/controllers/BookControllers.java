package com.example.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.dto.BookDTO;
import com.example.library.model.Books;
import com.example.library.service.bookService;


@RestController
@RequestMapping("/library")
public class BookControllers {
	
	@Autowired
	bookService bookservice;
	
	
	@GetMapping("/allbooks")
	public  List<BookDTO>  BookData() {
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	public BookDTO BookDatabyId(@PathVariable int id) {
		return bookservice.getBookById(id);
	}
	
	@PostMapping("/add")
	public void addBook(@RequestBody BookDTO book) {
		bookservice.add(book);
	}
	
	@PutMapping("/update")
	public void updateBook(@RequestBody BookDTO book) {
		bookservice.update(book);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable int id) {
		bookservice.deleteBook(id);
	}
	
}
