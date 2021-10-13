package swd20.bookStore;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.classic.Logger;
import swd20.bookStore.domain.Book;
import swd20.bookStore.domain.BookStoreRepository;
import swd20.bookStore.domain.Category;
import swd20.bookStore.domain.CategoryRepository;

@SpringBootApplication
public class BookStoreApplication {
	//private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookStoreRepository BookRepository, CategoryRepository CategoryRepository) {
		return (args) -> {
			//log.info("save something");
			Category scifi = new Category("scifi");
			Category comic = new Category("comic");
			
			CategoryRepository.save(scifi);
			CategoryRepository.save(comic);
			
			Book Ernest = new Book("Ernest Hemingway", "A Farewell to Arms", "1232323-21", "1929", CategoryRepository.findByName("scifi").get(0));
			Book George = new Book("George Orwell", "Animal Farm", "2212343-5", "1945", CategoryRepository.findByName("comic").get(0));
			
			BookRepository.save(Ernest);
			BookRepository.save(George);
			
			

			
			
		};
	}

}
