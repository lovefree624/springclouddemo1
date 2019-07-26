package com.example.eurekaconfigclient.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {
    /**接受消息**/
    @Input("testMessage1")
    SubscribableChannel input();
    /**发送消息**/
    @Output("testMessage")
    MessageChannel output();
}
