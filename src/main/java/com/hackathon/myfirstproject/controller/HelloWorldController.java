package com.hackathon.myfirstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/welcome")
	public String helloWorld() {
		return "Hello World";
	}

}
