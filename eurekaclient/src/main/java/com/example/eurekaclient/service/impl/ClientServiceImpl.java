/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  11:21
 */
package com.example.eurekaclient.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.eurekaclient.mapper.data1.PersonMapper;
import com.example.eurekaclient.service.ClientService;
import com.example.eurekacommon.entity.Person;
import com.example.eurekacommon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 11:21
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Resource
    PersonMapper personMapper;

//    @Value("${server.port}")
//    private String port;

//    @Override
//    public String getOne(String id) {
//        return "接口是："+port+",参数是："+id;
//    }

    @Override
    @DS("one")
    public User getOnePerson(String id) {
        return personMapper.getOnePerson(id);
    }

    @Override
    @DS("two")
    public List<User> getList() {
        return personMapper.getList();
    }

    @Override
    @DS("three")
    public User getOneUser(String id) {
        return personMapper.getOneUser(id);
    }

    @Override
    @DS("three")
    public List<User> getListUser() {
        return personMapper.getListUser();
    }
}
