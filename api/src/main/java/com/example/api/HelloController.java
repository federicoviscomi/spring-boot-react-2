package com.example.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${spring.profiles.active:}")
    private String activeProfile;

    @GetMapping("/hello")
    public String hello() {
        if (activeProfile.equals("dev")) {
            return "Hello from Docker Dev Mode 👋";
        } else if (activeProfile.equals("prod")) {
            return "Hello from Production Mode";
        } else {
            return "Hello from active profile " + activeProfile;
        }
    }
}
