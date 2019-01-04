package com.example.demo.base.demo1.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo.base.demo1.service")
public class EurekaBaseDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBaseDemo1Application.class, args);
    }
}
