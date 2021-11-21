package com.example.demo_core.service;

import com.example.demo_core.dao.entities.Car;
import com.example.demo_core.dao.entities.User;
import com.example.demo_core.dao.repositories.UserRepository;
import com.example.demo_core.pipeline.GetCarsPipelineFactoryImpl;
import com.example.demo_core.pipeline.Pipeline;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Log
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final String url = "http://localhost:3030/api/v1/first?requestString=";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hiDimon(String request) {
        log.info("get request = " + request);
        String resp = restTemplate.getForObject(url + request, String.class);
        log.info("get response = " + resp);
        return resp;
    }
}