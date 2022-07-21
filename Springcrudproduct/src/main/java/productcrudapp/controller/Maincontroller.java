package productcrudapp.controller;

import org.springframework.stereotype.Controller;


@Controller
public class Maincontroller {
	
	@RequestMapping
	public String homeString () {
		return "index";
	}

}
