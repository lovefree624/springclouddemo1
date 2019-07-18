/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  15:12
 */
package com.example.eurekasumer1.hystrix;

import com.example.eurekasumer1.service.SumerService;
import feign.hystrix.FallbackFactory;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 15:12
 */
public class ServiceFallBackFactory implements FallbackFactory<SumerService> {
    @Override
    public SumerService create(Throwable throwable) {
        return new SumerService() {
            @Override
            public String sumer(String name) {
                return "调用接口异常，参数："+name+"无法从其他模块中获取数据";
            }
        };
    }
}
