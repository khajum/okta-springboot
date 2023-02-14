package com.rlimbu.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Greeting {
    @GetMapping("/welcome-oauth")
    public String greet(Principal principal) {
        return "Hello World OAuth 2.0 ! Your email address: "+principal.getName();
    }
    @GetMapping("/{user}")
    public String greet(@PathVariable String user) {
        return "Good Evening "+user;
    }

}
