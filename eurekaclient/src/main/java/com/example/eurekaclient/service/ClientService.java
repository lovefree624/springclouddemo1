package com.example.eurekaclient.service;

import com.example.eurekacommon.entity.Person;
import com.example.eurekacommon.entity.User;

import java.util.List;

public interface ClientService {
//    String getOne(String id);

    User getOnePerson(String id);

    List<User> getList();

    User getOneUser(String id);

    List<User> getListUser();
}
