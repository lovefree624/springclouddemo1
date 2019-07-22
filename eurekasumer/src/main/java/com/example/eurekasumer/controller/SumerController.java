/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:27
 */
package com.example.eurekasumer.controller;

import com.example.eurekasumer.entity.ResMsg;
import com.example.eurekasumer.service.SumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:27
 */
@RestController

public class SumerController {

    @Autowired
    private SumerService sumerService;
    @RequestMapping(value = "/getName",method = RequestMethod.POST)
    private String sumer(String name){
       return sumerService.sumer(name);
    }

    @RequestMapping(value = "/getInterface",method = RequestMethod.POST)
    public List<HashMap<String,Object>> getInterface(){
       return sumerService.getInterface();
    }

}
