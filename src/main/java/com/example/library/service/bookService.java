package com.example.library.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.library.controllers.mapper.bookMapper;
import com.example.library.dto.BookDTO;
import com.example.library.model.Books;
import com.example.library.model.Borrow;
import com.example.library.repo.Bookrepo;
import com.example.library.repo.BorrowRepo;

@Service
public class bookService {

	@Autowired 
	Bookrepo bookrepo;
	
	@Autowired
	BorrowRepo borrowrepo;
	
	@Autowired
	bookMapper bookmapper;
	
	public List<BookDTO> getAllBooks() {
		
		List<Books> booklist= bookrepo.findAll();
		
		List<BookDTO> bookdtolist = booklist.stream()
				.map(x-> bookmapper.EntitytoDTO(x))
				.collect(Collectors.toList());
		
		return bookdtolist;
		
	}
	
	public BookDTO getBookById(int id) {
		
		Books book = bookrepo.findById(id).orElseThrow();
		return bookmapper.EntitytoDTO(book);
	}
	
	public void add(BookDTO book) {
		
		bookrepo.save(bookmapper.DTOtoEntity(book));
	}
	
	public void update(BookDTO bookdto) {
		
		Books book = bookrepo.findById(bookdto.getId()).orElseThrow();
				
		bookrepo.save(bookmapper.UpdateEntityfromDTO(bookdto, book));
		
	}
	
	public void deleteBook(int id) {
	
	    Borrow borrower = borrowrepo.findByBookId(id); 

	    if (borrower == null) {
	        bookrepo.deleteById(id);
	    } else {
	        throw new RuntimeException("Cannot delete book. It is currently borrowed.");
	    }
	}

	
	
	
}
