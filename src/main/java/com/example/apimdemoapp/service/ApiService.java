package com.example.apimdemoapp.service;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
