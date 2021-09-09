package swd20.bookStore.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class bookStoreController {

	@RequestMapping("/hello")
	public String hello() {

		return "Hello World";
	}
}
