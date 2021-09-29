package swd20.bookStore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String author, title, ISBN, year;

	
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Category category;
	
	
	public Book() {
	
	}
	
	public Book(String author, String title, String iSBN, String year, Category category) {
		super();
		this.author = author;
		this.title = title;
		this.ISBN = iSBN;
		this.year = year;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory (Category category) {
		this.category = category;
	}
	
	
	
	
	
}
