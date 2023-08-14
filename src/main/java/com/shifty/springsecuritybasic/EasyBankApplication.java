package com.shifty.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Main class for Spring Application
@SpringBootApplication
@RestController
public class EasyBankApplication {

	@GetMapping("/message")
	public String message()
	{
		return "Congrats";
	}

	public static void main(String[] args) {
		SpringApplication.run(EasyBankApplication.class, args);
	}

}
