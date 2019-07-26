/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  15:15
 */
package com.example.eurekasumer1.hystrixservice;

import com.example.eurekasumer1.hystrix.ServiceFallBackFactory;
import com.example.eurekasumer1.hystrix.ServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/18 15:15
 */
@FeignClient(name = "eureka-client",fallbackFactory = ServiceFallBackFactory.class)
public interface SumerFeignService {

    @RequestMapping(value = "/getOne", method = RequestMethod.POST)
    String sumer(@RequestParam("id") String name);
}