package com.example.demo.business.demo2.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDemo2Application.class, args);
    }

}