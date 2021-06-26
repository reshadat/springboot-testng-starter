package com.reshadat.springbootTestNGStarter.testNG.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements InitializingBean, DisposableBean {

    public int getValueOfB() {
        return 10;
    }

    @Override
    public void destroy() {
        String result = "Anything you do in destroy will run only once, just before Spring removes our bean from the application context";
        System.out.println(result);
    }

    @Override
    public void afterPropertiesSet(){
        String result = "Anything you do in afterPropertiesSet will run only once, just after the initialization of bean properties";
        System.out.println(result);

    }
}
