package com.example.demo.base.demo4.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo.base.demo4.service")
public class EurekaBaseDemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBaseDemo4Application.class, args);
    }

}

