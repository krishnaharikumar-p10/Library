package com.example.library.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.controllers.mapper.borrowMapper;
import com.example.library.dto.BorrowRequestDTO;
import com.example.library.dto.BorrowResponseDTO;
import com.example.library.model.Books;
import com.example.library.model.Borrow;
import com.example.library.repo.BorrowRepo;
import com.example.library.repo.Bookrepo;

@Service
public class BorrowService {
	
	@Autowired 
	BorrowRepo borrowrepo;
	
	@Autowired
	Bookrepo repo;
	
	@Autowired 
	borrowMapper mapper;
	

	public void BorrowBook(BorrowRequestDTO borrowdtobook) {

		Books book = repo.findById(borrowdtobook.getBookId())
				.orElseThrow(() -> new RuntimeException("Book not found"));
	
		if (!book.isAvailable()) {
			throw new RuntimeException("Book is already borrowed");
		}
		
		Borrow b=  mapper.DTOtoEntity(borrowdtobook);
		
		borrowrepo.save(b);
		book.setAvailable(false);
		repo.save(book);
		
	}


	public List<BorrowResponseDTO> getAllBorrowedBooks() {
			
		List<Borrow> allborrowers = borrowrepo.findAll();
		List<BorrowResponseDTO> borrowdto=allborrowers.stream()
		.map(x -> mapper.EntitytoDTO(x))
		.collect(Collectors.toList());
		
		return borrowdto;
		
		
	}


	public BorrowResponseDTO getBorrowById(int id) {
		
		Borrow borrow= borrowrepo.findById(id).orElseThrow(() -> new RuntimeException("There is no id :"+ id));
		return mapper.EntitytoDTO(borrow);
	}


	public void update(BorrowRequestDTO dto) {
		
		Borrow b= borrowrepo.findById(dto.getBorrowId())
				.orElseThrow(() -> new RuntimeException("Borrow id not found"));

		b.setBookId(dto.getBookId());
		b.setBorrowerName(dto.getBorrowerName());
		b.setContactNumber(dto.getContactNumber());
		b.setEmail(dto.getEmail());
		
		borrowrepo.save(b);
		
	}


	public void Return(int borrowid) {
		
		Borrow borrow= borrowrepo.findById(borrowid).orElseThrow(() ->new RuntimeException("Borrow id not found"));
		
		Books book = repo.findById(borrow.getBookId()).orElseThrow();
		book.setAvailable(true);
		repo.save(book);
		borrowrepo.delete(borrow);
		
	}
	
}
