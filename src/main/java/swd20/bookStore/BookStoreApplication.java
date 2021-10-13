package swd20.bookStore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import swd20.bookStore.domain.Book;
import swd20.bookStore.domain.BookStoreRepository;
import swd20.bookStore.domain.Category;
import swd20.bookStore.domain.CategoryRepository;
import swd20.bookStore.domain.User;
import swd20.bookStore.domain.UserRepository;

@SpringBootApplication
public class BookStoreApplication {
	//private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookStoreRepository BookRepository, CategoryRepository CategoryRepository, UserRepository UserRepository) {
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
			
			
			
			User user1 = new User("user", "$2a$10$TniQhWcbBQAKTGfFdmE9X.dhP6C/5HVJ1rovIHu5ijfgg45iTF5LG", "USER");
			User user2 = new User("admin", "$2a$10$5LH7lHXmihisynx4LpDN1uyvZmhAZ6L2E4XXULdaAVmRKCQajHnYK", "ADMIN");
			
			UserRepository.save(user1);
			UserRepository.save(user2);
			

			
			
		};
	}

}
