package com.example.demo.base.demo4.contract;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 11:57
 **/
@Configuration
@EnableFeignClients(basePackages = {"com.example.demo.base.demo4.contract.feign"})
@ConditionalOnMissingClass(value = {
        "com.example.demo.base.demo4.service.ConsulBaseDemo4Application",
        "com.example.demo.base.demo4.service.EurekaBaseDemo4Application"
})
public class Demo4AutoConfiguration {
}
