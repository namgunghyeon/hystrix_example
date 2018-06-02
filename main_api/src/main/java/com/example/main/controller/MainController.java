package com.example.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = "/api1", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<JsonResponse> api1() {
        return new ResponseEntity<JsonResponse>(new JsonResponse("api1"), HttpStatus.OK);
    }

    class JsonResponse {
        private String key;

        public JsonResponse() {}

        public JsonResponse(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

}
