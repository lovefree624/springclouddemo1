/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  10:06
 */
package com.example.eurekaconfigclient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/26 10:06
 */
@EnableBinding(value = StreamClient.class)
public class SinkRervice {
    Logger logger = LoggerFactory.getLogger(SinkRervice.class);
    @ServiceActivator(outputChannel = "testMessage")
    public void sinkReceive(String str){
        System.out.println("接收到的消息：" + str);
    }
}
