package com.csc.poc.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocLogApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(PocLogApplication.class, args);
        
        System.out.print(PocLogApplication.class.getName() + " started!");
    }
    
    @RequestMapping(value = "/")
    public String index() {
        return "Hello from Logging POC!";
    }
}
