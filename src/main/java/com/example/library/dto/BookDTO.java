package com.example.library.dto;

public class BookDTO {
	
	private int id;
	private String title;
	private String author;
	private int price;
	private String category;
	private boolean available;
	

	public BookDTO() {}

	public BookDTO(int id, String title, int price,String author, String category, boolean available) {
		super();
		this.id=id;
		this.title = title;
		this.price=price;
		this.author = author;
		this.category = category;
		this.available = available;
	}
		
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	
	}

}
