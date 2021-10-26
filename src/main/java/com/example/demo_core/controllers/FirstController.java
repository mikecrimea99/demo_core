package com.example.demo_core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("first")
    public String first() {
        return "Work";
    }
}
