package swd20.bookStore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import swd20.bookStore.domain.Book;
import swd20.bookStore.domain.BookStoreRepository;
import swd20.bookStore.domain.CategoryRepository;

@Controller
public class bookStoreController {

	@Autowired
	private BookStoreRepository repository;
	
	@Autowired
	private CategoryRepository crepository;
	
	@RequestMapping(value = "/bookstore", method = RequestMethod.GET)
	public String bookStoreList(Model model) {
		
		model.addAttribute("books", repository.findAll());
		
		return "bookstore";
	}
	
	@RequestMapping(value= "/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categories", crepository.findAll());
		return "addBook";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(Book book) {
		repository.save(book);
		return "redirect:bookstore";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String deleteStident(@PathVariable("id") Long bookId, Model model) {
		repository.deleteById(bookId);
		return "redirect:../bookstore";
	}
	
	
}
