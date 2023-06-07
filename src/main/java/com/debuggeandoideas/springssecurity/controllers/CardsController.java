package com.debuggeandoideas.springssecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("cards")
    public String get() {
        return "cards";
    }
}
