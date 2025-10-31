package com.example.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Books;
import com.example.library.model.Borrow;

@Repository
public interface BorrowRepo extends JpaRepository<Borrow,Integer> {
	
	void deleteByBookId(int bookId);
	
	Borrow findByBookId(int bookId);
}
