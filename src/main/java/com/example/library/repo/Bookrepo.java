package com.example.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Books;


@Repository 
public interface Bookrepo extends JpaRepository<Books,Integer>{
	
	
	
}
