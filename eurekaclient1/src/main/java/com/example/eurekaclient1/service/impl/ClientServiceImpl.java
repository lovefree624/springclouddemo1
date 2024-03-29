/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:21
 */
package com.example.eurekaclient1.service.impl;

import com.example.eurekaclient1.service.ClientService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:21
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Value("${server.port}")
    private String port;

    @Override
    public String getOne(String id) {
        return "接口是："+port+",参数是："+id;
    }
}
