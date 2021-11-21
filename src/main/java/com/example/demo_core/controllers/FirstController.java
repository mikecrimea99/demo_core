package com.example.demo_core.controllers;

import com.example.demo_core.dao.entities.Car;
import com.example.demo_core.dao.entities.User;
import com.example.demo_core.pipeline.GetCarsPipelineFactoryImpl;
import com.example.demo_core.pipeline.PipelineFactory;
import com.example.demo_core.service.UserService;
import org.apache.catalina.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class FirstController {
    UserService userService;
    GetCarsPipelineFactoryImpl getCarsPipelineFactory;

    @Autowired
    public FirstController(UserService userService, GetCarsPipelineFactoryImpl getCarsPipelineFactory) {
        this.userService = userService;
        this.getCarsPipelineFactory = getCarsPipelineFactory;
    }

    @GetMapping("greetings")
    public String getGreetings(@RequestParam String str) {
        return userService.hiDimon(str);
    }
}