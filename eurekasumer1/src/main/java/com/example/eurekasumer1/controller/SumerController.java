/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:27
 */
package com.example.eurekasumer1.controller;

import com.example.eurekasumer1.hystrixservice.SumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:27
 */
@RestController
@RefreshScope
public class SumerController {

    @Value("${pws.name}")
    private String name1;

    @Resource
    SumerFeignService sumerFeignService;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public String sumer12(String name){
        System.out.println(name1);
        return sumerFeignService.sumer(name);
    }
}
