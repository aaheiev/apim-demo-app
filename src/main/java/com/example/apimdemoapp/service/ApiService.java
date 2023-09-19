package com.example.apimdemoapp.service;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String reverseName(String name) {
        if (name == null) {
            return null;
        }
        return new StringBuilder(name).reverse().toString();
    }
}
