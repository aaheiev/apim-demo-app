package com.example.apimdemoapp.api;

import com.example.apimdemoapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

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

    @GetMapping("/reverse-name")
    public ResponseEntity<String> reverseName(@RequestParam String name) {
        String greeting = apiService.reverseName(name);
        return ResponseEntity.ok(greeting);
    }
}
