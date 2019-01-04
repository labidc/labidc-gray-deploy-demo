package com.example.demo.product.web;

import com.example.demo.business.demo2.contract.EnableDemo2Util;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableDemo2Util
@EnableDiscoveryClient
public class WebDemoApplication {

    public static void main(String[] args) {
        run(WebDemoApplication.class, args);
    }
}

