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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:27
 */
@RestController

public class SumerController {

//    @Autowired
//    private SumerService sumerService;
    @Autowired
    SumerFeignService sumerFeignService;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    private String sumer(String name){
//       return sumerService.sumer(name);
        return sumerFeignService.sumer(name);
    }
}
