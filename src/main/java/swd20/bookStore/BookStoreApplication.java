package swd20.bookStore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import swd20.bookStore.domain.Book;
import swd20.bookStore.domain.BookStoreRepository;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookStoreRepository repository) {
		return (args) -> {
			Book Ernest = new Book("Ernest Hemingway", "A Farewell to Arms", "1232323-21", "1929");
			Book George = new Book("George Orwell", "Animal Farm", "2212343-5", "1945");
			
			
			repository.save(Ernest);
			repository.save(George);
			
			
		};
	}

}
