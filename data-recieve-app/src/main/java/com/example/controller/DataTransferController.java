package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTransferController {
    @PostMapping("/receive")
    public ResponseEntity<String> receiveData(@RequestBody String data) {
        System.out.println("Received data: " + data);
        return ResponseEntity.ok("Data received successfully!");
    }
}
