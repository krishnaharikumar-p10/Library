package com.example.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	private int id;
	private String title;
	private String author;
	private int price;
	private String category;
	private boolean available;
	

	public Books() {}

	public Books(int id, String title, String author, String category, int price,boolean available) {
		super();
		this.id=id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
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
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", category="
				+ category + ", available=" + available + "]";
	}

}
