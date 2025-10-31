package com.example.library.controllers.mapper;

import org.springframework.stereotype.Component;

import com.example.library.dto.BookDTO;
import com.example.library.model.Books;
import com.example.library.service.bookService;


@Component
public class bookMapper {

	
	public BookDTO EntitytoDTO(Books book) {
		
		BookDTO bookdto= new BookDTO();
		bookdto.setId(book.getId());
		bookdto.setTitle(book.getTitle());
		bookdto.setAuthor(book.getAuthor());
		bookdto.setCategory(book.getCategory());
		bookdto.setPrice(book.getPrice());
		bookdto.setAvailable(book.isAvailable());
		return bookdto;
	}
	
	public Books DTOtoEntity(BookDTO bookdto) {
		
		Books book = new Books();
		book.setId(bookdto.getId());
		book.setTitle(bookdto.getTitle());
		book.setAuthor(bookdto.getAuthor());
		book.setCategory(bookdto.getCategory());
		book.setPrice(bookdto.getPrice());
		book.setAvailable(bookdto.isAvailable());
		return book;
	}
	
	public Books UpdateEntityfromDTO( BookDTO bookdto,Books book) {
		
		book.setId(bookdto.getId());
		book.setTitle(bookdto.getTitle());
		book.setAuthor(bookdto.getAuthor());
		book.setCategory(bookdto.getCategory());
		book.setAvailable(bookdto.isAvailable());
		book.setPrice(bookdto.getPrice());
		return book;
	}
	
	
	
}
