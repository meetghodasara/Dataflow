package com.example.controller;

import com.example.model.TransferConfig;
import com.example.service.DataTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTransferController {

    private final DataTransferService dataTransferService;

    @Autowired
    public DataTransferController(DataTransferService dataTransferService) {
        this.dataTransferService = dataTransferService;
    }

    @PostMapping("/transfer")
    public String transferData(@RequestBody TransferConfig transferConfig) {
        dataTransferService.transferData();
        return "Data transfer initiated!";
    }
}
