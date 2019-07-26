/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  9:26
 */
package com.example.eurekacommon.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/25 9:26
 */
@Data
public class Person implements Serializable {

    private String name;

    private int age;

    private String sex;

    private String factoryName;
}
