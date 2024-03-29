/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:30
 */
package com.example.eurekasumer1.service.impl;

import com.example.eurekasumer1.service.SumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:30
 */
@Service
public class SumerServiceImpl implements SumerService {

    @Autowired
    private RestTemplate restTemplate;
    String url = "http://eureka-client/getOne";

    @Override
    @HystrixCommand(fallbackMethod = "sumerError")
    public String sumer(String name) {
        UriComponents encode = UriComponentsBuilder.fromUriString(url+"?id={name}").build().expand(name).encode();
        URI uri = encode.toUri();
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("id",name);
        return restTemplate.postForObject(uri+"?id={id}",null,String.class,stringStringHashMap);
//        return restTemplate.postForObject(uri,null,String.class);
//        return restTemplate.postForObject(url+"?id={1}",null,String.class,name);
//        return restTemplate.getForObject("http://eureka-client/getOne?id="+name,String.class);
    }

    public String sumerError(String name){
        return "调用接口异常，参数："+name+"无法从其他模块中获取数据";
    }
}
