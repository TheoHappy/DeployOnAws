package com.example.deployaws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api")
public class RestConstroller {
    @GetMapping("test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>("HEy", HttpStatus.OK);
    }
}
