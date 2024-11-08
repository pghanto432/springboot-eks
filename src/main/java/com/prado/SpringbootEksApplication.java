package com.prado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootEksApplication {

	@GetMapping("/greetings")
	public String greetings() {
		return "Hello Prado...the application is now deployed to AWS EKS!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEksApplication.class, args);
	}

}
