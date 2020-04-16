package com.sap.Bookshop.model_TB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "BOOK_TABLE")
public class Book_TB {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UUID")
	private int uuid;
	
	@Column(name = "ISBN")
	private String ISBN = "1234";
	
	
	@Column(name = "TITLE")
	private String title= "Es";
	
	@Column(name = "AUTHOR")
	private String author= "Stephen King";
	
	@Column(name = "PUBYEAR")
	private int publishingYear = 2019;
	
	@Column(name = "EDITOR")
	private String editor = "DTBV";
	

	
	

}
