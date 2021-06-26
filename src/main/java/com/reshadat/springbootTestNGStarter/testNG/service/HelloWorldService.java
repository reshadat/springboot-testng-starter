package com.reshadat.springbootTestNGStarter.testNG.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class HelloWorldService {

    public int getValueOfB() {
        return 10;
    }


    @PostConstruct
    void init() {
        String result = "Anything you do in PostConstruct will run only once, just after the initialization of bean properties";
        System.out.println(result);
    }

    @PreDestroy
    void cleanup() {
        String result = "Anything you do in PreDestroy will run only once, just before Spring removes our bean from the application context";
        System.out.println(result);
    }
}
