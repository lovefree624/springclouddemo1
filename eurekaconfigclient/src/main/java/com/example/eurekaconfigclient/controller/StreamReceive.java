
package com.example.eurekaconfigclient.controller;

import com.example.eurekaconfigclient.service.StreamClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description 接收消息
 * @date 2019/7/25 16:36
 */
@Component
@EnableBinding(StreamClient.class)
public class StreamReceive {
    Logger logger = LoggerFactory.getLogger(StreamReceive.class);

    @StreamListener("testMessage")
    public void receive(Object payload) {
        logger.info("receive:" + payload);
        System.out.println(payload);
    }
}
