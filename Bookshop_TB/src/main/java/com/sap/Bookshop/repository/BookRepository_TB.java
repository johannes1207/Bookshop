package com.sap.Bookshop.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.Bookshop.model_TB.Book_TB;

@Repository
public interface BookRepository_TB extends JpaRepository<Book_TB, Integer> {

}
