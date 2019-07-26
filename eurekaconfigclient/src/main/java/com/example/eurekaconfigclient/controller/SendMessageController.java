/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  17:38
 */
package com.example.eurekaconfigclient.controller;

import com.example.eurekaconfigclient.service.StreamClient;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/25 17:38
 */
@RestController
public class SendMessageController {
    @Resource
    private StreamClient streamClient;

    @RequestMapping(value = "/sendMessage",method = RequestMethod.POST)
    public void send(){
        streamClient.output().send(MessageBuilder.withPayload("it is a message").build());
    }
}
