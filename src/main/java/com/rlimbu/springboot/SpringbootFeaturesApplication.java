package com.rlimbu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringbootFeaturesApplication {

	@GetMapping("/login")
	public String login() {
		return "Welcome!";
	}

	@GetMapping("/")
	public String welcomUser(Principal principal) {
		return "Hey There! Your email address is: "+principal.getName()+" !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeaturesApplication.class, args);
	}

}
