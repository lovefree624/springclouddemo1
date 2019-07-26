package com.example.eurekaconfigclient.config;

import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class SenderTest {
    @Autowired
    private Sender sender;

    @Test
    public void send() {
        sender.send();
    }
}