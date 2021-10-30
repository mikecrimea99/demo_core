package com.example.demo_core.controllers;

import com.example.demo_core.dao.entities.User;
import com.example.demo_core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @Autowired
    UserService userService;

    @GetMapping("first")
    public User first() {
        return userService.getUserById(1);
    }
}
