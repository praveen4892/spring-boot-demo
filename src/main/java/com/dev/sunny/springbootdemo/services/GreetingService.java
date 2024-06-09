package com.dev.sunny.springbootdemo.services;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GreetingService {
    public Map<String, String> greet(String name) {
        return Map.of("greetMessage", "Hello " + name);
    }
}
