package com.example.demo.business.demo2.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaBusinessDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBusinessDemoApplication.class, args);
    }

}
