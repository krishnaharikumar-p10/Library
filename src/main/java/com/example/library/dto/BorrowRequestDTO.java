package com.example.library.dto;

public class BorrowRequestDTO {
	private int borrowId;
	private int bookId;
	private String borrowerName;
	private int contactNumber;
	private String email;


	public BorrowRequestDTO(int borrowId, int bookId, String borrowerName,String email, int contactNumber) {
		super();
		
		this.borrowId = borrowId;
		this.bookId = bookId;
		this.borrowerName = borrowerName;
		this.email=email;
		this.contactNumber = contactNumber;
		
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
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
