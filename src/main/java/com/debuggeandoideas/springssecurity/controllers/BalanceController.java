package com.debuggeandoideas.springssecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("balance")
    public String get() {
        return "balance";
    }
}
