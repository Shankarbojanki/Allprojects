package com.shankar.Springanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("worlds best cpu");

	}

}
