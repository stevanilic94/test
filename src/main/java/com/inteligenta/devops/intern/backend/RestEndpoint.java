package com.inteligenta.devops.intern.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class RestEndpoint {
    @GetMapping
    private String getHelloWorld(){
        return "Hello world";
    }
}
