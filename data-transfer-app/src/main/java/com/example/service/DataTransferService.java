package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataTransferService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${transfer.source.url}")
    private String sourceUrl;

    @Value("${transfer.destination.url}")
    private String destinationUrl;

    @Scheduled(fixedRateString = "${transfer.interval}")
    public void transferData() {
        // Fetch data from source URL
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(sourceUrl, String.class);
        String data = responseEntity.getBody();

        // Send data to destination URL
        restTemplate.postForEntity(destinationUrl, data, String.class);
    }
}
