package com.shankar.Shabo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    public void drive() {
    	System.out.println("get ready for bike race");
    }
}
