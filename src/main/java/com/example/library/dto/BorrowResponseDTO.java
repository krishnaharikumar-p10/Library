package com.example.library.dto;

public class BorrowResponseDTO {
	private int borrowId;
	private int bookId;
	private String borrowerName;

	public BorrowResponseDTO(){}

	public BorrowResponseDTO(int borrowId, int bookId, String borrowerName,String email, int contactNumber) {
		this.borrowId = borrowId;
		this.bookId = bookId;
		this.borrowerName = borrowerName;
		
	}
	
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	

}
