/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  10:44
 */
package com.example.eurekaconfigclient.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/24 10:44
 */
@Component
@RabbitListener(queues = "hello")
public class Receive {

    @RabbitHandler
    public void received(String hello){
        System.out.println("received:" + hello);
    }
}
