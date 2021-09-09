package swd20.bookStore.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class bookStoreController {

	@RequestMapping(value = "/bookStoreIndex", method = RequestMethod.GET)
	public String hello() {

		
		return "bookStoreIndex";
	}
}
