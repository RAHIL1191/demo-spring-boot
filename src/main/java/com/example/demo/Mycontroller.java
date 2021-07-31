package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class Mycontroller {

    @GetMapping("/customer")
    public String getName(){
      return "Hello";
    }
}
