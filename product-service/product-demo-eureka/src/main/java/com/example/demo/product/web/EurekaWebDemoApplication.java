package com.example.demo.product.web;

import com.example.demo.business.demo2.contract.EnableDemo2Util;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication(scanBasePackages = "com.example.demo.product.web")
@EnableDemo2Util
@EnableDiscoveryClient
public class EurekaWebDemoApplication {

    public static void main(String[] args) {
        run(EurekaWebDemoApplication.class, args);
    }
}

