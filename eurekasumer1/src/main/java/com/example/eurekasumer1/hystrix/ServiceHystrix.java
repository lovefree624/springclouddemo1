/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  15:31
 */
package com.example.eurekasumer1.hystrix;

import com.example.eurekasumer1.hystrixservice.SumerFeignService;
import org.springframework.stereotype.Component;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 15:31
 */
@Component
public class ServiceHystrix implements SumerFeignService {
    @Override
    public String sumer(String id) {
        return  "调用接口异常，参数："+id+"无法从其他模块中获取数据";
    }
}
