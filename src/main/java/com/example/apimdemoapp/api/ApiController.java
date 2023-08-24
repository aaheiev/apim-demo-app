package com.example.apimdemoapp.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {


    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Service is healthy");
    }


    @GetMapping("/version")
    public ResponseEntity<String> getVersion() {

        String version = System.getenv("VERSION");
        if (version != null && !version.trim().isEmpty()) {
            return ResponseEntity.ok("Service version: " + version);
        } else {
            return ResponseEntity.ok("Version is not available");
        }
    }
}
