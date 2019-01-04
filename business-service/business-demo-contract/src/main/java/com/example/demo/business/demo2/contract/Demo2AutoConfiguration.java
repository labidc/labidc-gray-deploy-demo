package com.example.demo.business.demo2.contract;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 15:15
 **/
@Configuration
@EnableFeignClients(basePackages = {"com.example.demo.business.demo2.contract.feign"})
public class Demo2AutoConfiguration {
}
