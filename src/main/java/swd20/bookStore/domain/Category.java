package swd20.bookStore.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long categoryid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private List<Book> books;
	
	
	public Category() {
		
	}
	
	public Category(String name) {
		super();
		this.name = name;
	}
	
	public long getId() {
		return categoryid;
	}
	public void setId(long id) {
		this.categoryid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		// Do not insert list attribute students here! Otherwise execution of this method causes an infinite loop. 
		return "Category [categoryid=" + categoryid + ", name=" + name + "]";
	}
	
}
