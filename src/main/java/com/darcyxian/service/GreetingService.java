package com.darcyxian.service;

import com.darcyxian.aspect.Countable;
import com.darcyxian.aspect.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    public GreetingService(){};
    @Loggable
    @Countable
    public String getGreeting(String name){
        return greeting + " " + name;
    }
}
