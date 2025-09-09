package org.example.handson1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {
    @GetMapping("/oracle")
    public ResponseEntity<String> oracle(){
        return ResponseEntity.ok("Hi Guest!!");
    }
}
