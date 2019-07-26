/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  10:38
 */
package com.example.eurekaconfigclient.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/24 10:38
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello"+new Date();
        System.out.println("Sender:" + context);
        amqpTemplate.convertAndSend("hello",context);
    }
}
