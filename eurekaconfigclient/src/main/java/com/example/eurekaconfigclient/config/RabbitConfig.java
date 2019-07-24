/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  10:41
 */
package com.example.eurekaconfigclient.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/24 10:41
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return  new Queue("hello");
    }
}
