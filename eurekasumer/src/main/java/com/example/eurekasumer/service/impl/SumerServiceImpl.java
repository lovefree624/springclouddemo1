/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:30
 */
package com.example.eurekasumer.service.impl;

import com.example.eurekasumer.entity.ResMsg;
import com.example.eurekasumer.service.SumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    String rul = "http://zte-interface-service/queryDetail/byConnectionid";
@Override
    public String sumer(String name) {
        UriComponents encode = UriComponentsBuilder.fromUriString(url+"?id={name}").build().expand(name).encode();
        URI uri = encode.toUri();
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("id",name);
        return restTemplate.postForObject(url+"?id={id}",null,String.class,stringStringHashMap);
//        return restTemplate.postForObject(uri,null,String.class);
//        return restTemplate.postForObject(url+"?id={1}",null,String.class,name);
//        return restTemplate.getForObject("http://eureka-client/getOne?id="+name,String.class);
    }
    @HystrixCommand(fallbackMethod = "getInterfaceError")
    @Override
    public List<HashMap<String,Object>> getInterface() {
        return restTemplate.postForObject(rul+"?conid={1}",null,List.class,1);
    }

    public List<HashMap<String,Object>> getInterfaceError(){
        List<HashMap<String,Object>> list = new ArrayList<>();
        HashMap<String, Object> params = new HashMap(2);
//        params.put("connectionid", connid);
//        hashMaps = agentCallDetailDao.findListBySqlMap(params);
        params.put("code",400);
        params.put("msg","测试失败");
        list.add(params);
        return list;
    }
}
