package com.example.eurekaconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaconfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaconfigclientApplication.class, args);
    }
}
