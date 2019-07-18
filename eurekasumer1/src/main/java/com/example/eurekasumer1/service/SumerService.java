package com.example.eurekasumer1.service;

import org.springframework.cloud.openfeign.FeignClient;

public interface SumerService {
    String sumer(String name);
}
