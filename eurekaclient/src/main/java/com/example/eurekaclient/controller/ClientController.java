/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:17
 */
package com.example.eurekaclient.controller;

import com.example.eurekaclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:17
 */
@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "getOne",method = RequestMethod.POST)
    public String getOne(@RequestParam String id){
        return  clientService.getOne(id);
    }
}
