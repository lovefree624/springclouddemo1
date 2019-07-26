package com.example.eurekaclient.service;

import com.example.eurekacommon.entity.Person;

import java.util.List;

public interface ClientService {
    String getOne(String id);

    Person getOnePerson(String id);

    List<Person> getList();
}
