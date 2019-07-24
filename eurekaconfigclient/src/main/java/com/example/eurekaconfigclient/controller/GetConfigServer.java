/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  16:04
 */
package com.example.eurekaconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/19 16:04
 */
@RefreshScope
@RestController
public class GetConfigServer {

    @Value("${pws.name}")
    private String datasource;

    @PostMapping(value = "/getDataSource")
    public String getDatasource() {
        return datasource;
    }
}
