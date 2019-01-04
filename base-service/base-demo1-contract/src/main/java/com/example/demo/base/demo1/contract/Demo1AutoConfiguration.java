package com.example.demo.base.demo1.contract;

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
@EnableFeignClients(basePackages = {"com.example.demo.base.demo1.contract.feign"})
@ConditionalOnMissingClass(value = {
        "com.example.demo.base.demo1.service.ConsulBaseDemo1Application",
        "com.example.demo.base.demo1.service.EurekaBaseDemo1Application"
})
public class Demo1AutoConfiguration {
}
