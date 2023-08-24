package com.example.apimdemoapp.service;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String mirrorName(String name) {
        if (name == null) {
            return null;
        }
        return name + "|"+ new StringBuilder(name).reverse();
    }
}
