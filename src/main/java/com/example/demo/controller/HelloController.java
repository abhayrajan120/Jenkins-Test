package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	
	@GetMapping("/abra")
	public String home() {
		return "hi abhay , jenkins";
	}
	
	@GetMapping("/bbb")
	public String home1() {
		return "hi abhay , jenkins";
	}
	
	
}
