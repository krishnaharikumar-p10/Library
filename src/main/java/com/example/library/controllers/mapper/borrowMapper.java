package com.example.library.controllers.mapper;

import org.springframework.stereotype.Component;

import com.example.library.dto.BorrowRequestDTO;
import com.example.library.dto.BorrowResponseDTO;
import com.example.library.model.Books;
import com.example.library.model.Borrow;

@Component
public class borrowMapper {

	public Borrow DTOtoEntity(BorrowRequestDTO dto) {
		
		Borrow b= new Borrow();
		b.setBookId(dto.getBookId());
		b.setBorrowerName(dto.getBorrowerName());
		b.setBorrowId(dto.getBorrowId());
		b.setContactNumber(dto.getContactNumber());
		b.setEmail(dto.getEmail());
		
		return b;
	}
	
	public BorrowResponseDTO EntitytoDTO(Borrow borrow) {
		
		BorrowResponseDTO dto = new BorrowResponseDTO();
		dto.setBookId(borrow.getBookId());
		dto.setBorrowerName(borrow.getBorrowerName());
		dto.setBorrowId(borrow.getBorrowId());
		
		return dto;
		
	}
}
