package com.debuggeandoideas.springssecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @GetMapping("contact")
    public String get() {
        return "contact";
    }
}
