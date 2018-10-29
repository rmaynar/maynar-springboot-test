package com.maynar.maynarspringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MaynarSpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaynarSpringbootTestApplication.class, args);
	}

	@GetMapping("/")
	public String sayHello() {
		return "Hi there, this is a Spring Boot application";
	}
	
	@GetMapping("/hola")
	public String sayHola() {
		return "Hi there, this is a Spring Boot application";
	}
}
