package com.example.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.dto.BorrowRequestDTO;
import com.example.library.dto.BorrowResponseDTO;
import com.example.library.service.BorrowService;

@RestController
public class BorrowControllers {
	

	@Autowired
	BorrowService borrowservice;
	
	@PostMapping("/borrow")
	
	public void BorrowBook(@RequestBody BorrowRequestDTO borrowdtobook) {
		
			borrowservice.BorrowBook(borrowdtobook);
	}
	
	
	@GetMapping("/borrow")
	public List<BorrowResponseDTO> getAllBorrowedBooks() {
		
		return borrowservice.getAllBorrowedBooks();
	}
	
	@GetMapping("/borrow/{id}")
	public BorrowResponseDTO getBorrowById(@PathVariable int id) {
		return borrowservice.getBorrowById(id);
		
	}
	
	@PutMapping("/update")
	public void Update(@RequestBody BorrowRequestDTO dto) {
		borrowservice.update(dto);
	}
	
	@DeleteMapping("/delete/{borrowid}")
	public void Return(@PathVariable int borrowid){
		borrowservice.Return(borrowid);
		
	}
	
}
