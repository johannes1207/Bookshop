package com.sap.Bookshop.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sap.Bookshop.model_TB.Book_TB;

@Repository
public interface BookRepository_TB extends JpaRepository<Book_TB, Integer> {

	public static final String FIND_PROJECTS = "SELECT UUID, ISBN, TITLE, AUTHOR, PUBYEAR FROM BOOK_TABLE";

	@Query(value = FIND_PROJECTS, nativeQuery = true)
	public List<Book_TB> findProjects();
	
	
}
