package com.debuggeandoideas.springssecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @GetMapping(path = "about-us")
    public String get(){
        return "about-us";
    }
}
