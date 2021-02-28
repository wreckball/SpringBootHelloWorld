package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootdemoController {
	
	@RequestMapping("/")
	public String Spring(@RequestParam(value="name",defaultValue = "World") String name) {
		return "Hello " + name;
	}
}
