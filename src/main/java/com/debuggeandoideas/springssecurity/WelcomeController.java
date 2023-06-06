package com.debuggeandoideas.springssecurity;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    @Secured("ROLE_VIEWER")
    public String sayWelcome() {
        return "Welcome to the course";
    }
}
