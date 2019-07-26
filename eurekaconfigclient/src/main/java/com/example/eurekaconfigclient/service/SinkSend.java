/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  10:14
 */
package com.example.eurekaconfigclient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/26 10:14
 */
@EnableBinding(value = StreamClient.class)
public class SinkSend {
    Logger logger = LoggerFactory.getLogger(SinkSend.class);

    @Bean
    @InboundChannelAdapter(value = "testMessage",poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessage(){
        return ()->new GenericMessage<>(new Date());
    }
}
