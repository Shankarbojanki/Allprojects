package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goToHomepage(){
        System.out.println("In Home controller");
        return "index";
    }
}
