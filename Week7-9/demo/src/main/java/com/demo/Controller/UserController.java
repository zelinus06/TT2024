package com.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/welcome")
    public String getWelcomeMsg() {
        return "Welcome";
    }

    @GetMapping("/greet")
    public String getGreetMsg() {
        return "Good Morning..!!";
    }
}
