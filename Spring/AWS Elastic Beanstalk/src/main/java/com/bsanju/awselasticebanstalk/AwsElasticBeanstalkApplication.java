package com.bsanju.awselasticebanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsElasticBeanstalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsElasticBeanstalkApplication.class, args);
    }

    @RequestMapping("/status")
    public String status() {
        return "Application is running";
    }
    @RequestMapping("/")
    public String index() {
        return "This is main Page & running";
    }


}
