package com.example.demo_core.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.persistence.Entity;

@Configuration
@ComponentScan(basePackages = "com.example.demo_core")
@EnableJpaRepositories(basePackages = "com.example.demo_core.dao.repositories")
@EntityScan(basePackages = "com.example.demo_core.dao.entities")
public class WebMvcConfig implements WebMvcConfigurer {

//    @Bean
//    public HandlerInterceptor getAuthInterceptor(){
//        return
//    }
}