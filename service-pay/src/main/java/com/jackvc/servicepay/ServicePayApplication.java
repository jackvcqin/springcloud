package com.jackvc.servicepay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicePayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePayApplication.class, args);
    }

}
