package com.scallion.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/24 10:34
 */
@Service
public class SampleClient {
    @Value("${app.access-url}")
    private String endpoint;

    private RestTemplate restTemplate;

    public SampleClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getData() {
        return restTemplate.getForObject(endpoint, String.class);
    }
}
