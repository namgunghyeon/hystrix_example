package com.example.main.controller;

import com.example.main.service.ApiCall;
import com.example.main.model.JsonResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class MainController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ApiCall apiCall;

    @RequestMapping(value = "/api1", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<JsonResponse> api1() {
        return apiCall.callApi1();
    }

    @RequestMapping(value = "/api2", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<JsonResponse> api2() {
        return apiCall.callApi2();
    }

    @RequestMapping(value = "/api3", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<JsonResponse> api3() {
        return apiCall.callApi3();
    }

}
