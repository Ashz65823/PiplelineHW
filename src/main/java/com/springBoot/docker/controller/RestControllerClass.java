package com.springBoot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
	
	@GetMapping("/hi")
	public String dispalyMsg() {
		return"<h1>Hello World</h1>";
	}
	
	@GetMapping("/api")
	public String dispaly() {
		return"<h1>Hello Jenkins..!! </h1>";
	}
}
