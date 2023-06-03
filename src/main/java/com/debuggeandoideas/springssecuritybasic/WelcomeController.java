package com.debuggeandoideas.springssecuritybasic;

import org.springframework.context.annotation.ComponentScan;
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
