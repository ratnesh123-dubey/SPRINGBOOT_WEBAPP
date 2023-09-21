package com.example.rd.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping()
	public String getHelloSpringHomepage() {
		return "Hello Spring";
	}
	
	@GetMapping("search")
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("searching")
	public String searchKro(@RequestParam(name = "q") String value) {
		return value;
	}
	
	@GetMapping("searchingpath/{name}")
	public String searchKroPathVariable(@PathVariable(name = "name") String value) {
		return value;
	}
	
	//localhost:8080/post
	@PostMapping(path = "post")
	public void postKro() {
		System.out.println("running post");
	}
}
