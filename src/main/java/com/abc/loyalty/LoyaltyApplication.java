package com.abc.loyalty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoyaltyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyApplication.class, args);
	}

//	@GetMapping("/hello")
//	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}

}
