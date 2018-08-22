package com.csc.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocLogbackKafkaApplication {
    private static final Logger LOG = LoggerFactory.getLogger(PocLogbackKafkaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PocLogbackKafkaApplication.class, args);
        
        LOG.info(PocLogbackKafkaApplication.class.getName() + " started!");
	}
    
    @RequestMapping(value = "/")
    public String index() {
        String msg = "Welcome to Logback-Kafka POC!";
        
        testLog(msg);
        
        return msg;
    }
    
    private void testLog(String msg) {
        int batch = 100;
        for (int i = 0; i < batch; i++) {
            LOG.info("{}#{}", i, msg);
        }
    }
}
