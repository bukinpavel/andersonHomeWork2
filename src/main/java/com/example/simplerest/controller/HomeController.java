package com.example.simplerest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class HomeController {
    @GetMapping("home")
    public ResponseEntity<String> homePage() {
        return ResponseEntity.ok("Deployed on Tomcat");
    }
}
