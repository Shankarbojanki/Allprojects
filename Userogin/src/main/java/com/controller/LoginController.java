package com.controller;

import org.springframework.stereotype.Controller;


@Controller
public class LoginController {
	
	@GetMapping("/login")
     public String getLoginpage() {
    	 return"login";
    	
     }
}
