package com.example.eurekaclient.mapper.data1;

import com.example.eurekacommon.entity.Person;
import com.example.eurekacommon.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    User getOnePerson(String id);

    List<User> getList();

    User getOneUser(String id);

    List<User> getListUser();
}
