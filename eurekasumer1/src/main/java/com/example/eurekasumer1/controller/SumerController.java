/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:27
 */
package com.example.eurekasumer1.controller;

import com.example.eurekasumer1.hystrixservice.SumerFeignService;
import com.example.eurekasumer1.service.SumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

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


    @Resource
    SumerFeignService sumerFeignService;
    @Resource
    SumerService sumerService;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public String sumer12(String name){
        return sumerFeignService.sumer(name);
    }

    @RequestMapping(value = "/getName",method = RequestMethod.POST)
    public String sumer(String id){
        return sumerService.sumer(id);
    }
}
