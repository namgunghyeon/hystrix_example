package com.example.main.service;

import com.example.main.model.JsonResponse;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiCall {

    @HystrixCommand(fallbackMethod = "fallback")
    public ResponseEntity<JsonResponse> callApi1() {
        RestTemplate restTemplate = new RestTemplate();
        String responseString = restTemplate.getForObject("http://localhost:8081/api1", String.class);

        return new ResponseEntity<JsonResponse>(new JsonResponse(responseString), HttpStatus.OK);
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public ResponseEntity<JsonResponse> callApi2() {
        RestTemplate restTemplate = new RestTemplate();
        String responseString = restTemplate.getForObject("http://localhost:8082/api2", String.class);

        return new ResponseEntity<JsonResponse>(new JsonResponse(responseString), HttpStatus.OK);
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public ResponseEntity<JsonResponse> callApi3() {
        RestTemplate restTemplate = new RestTemplate();
        String responseString = restTemplate.getForObject("http://localhost:8083/api3", String.class);

        return new ResponseEntity<JsonResponse>(new JsonResponse(responseString), HttpStatus.OK);
    }

    @SuppressWarnings("unused")
    public ResponseEntity<JsonResponse> fallback() {
        return new ResponseEntity<JsonResponse>(new JsonResponse("fallback error"), HttpStatus.OK);
    }

}
