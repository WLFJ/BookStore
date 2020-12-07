package fun.wlfj.wyw1813004316jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	@RequestMapping("/error1")
	public String showError() {
		return "error_page";
	}

}
