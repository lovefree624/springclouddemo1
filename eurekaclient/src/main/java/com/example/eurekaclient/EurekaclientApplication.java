package com.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@MapperScan("com.example.eurekaclient.mapper")
public class EurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }

}
