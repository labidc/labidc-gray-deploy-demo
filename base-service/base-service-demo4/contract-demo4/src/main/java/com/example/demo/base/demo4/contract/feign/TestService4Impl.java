package com.example.demo.base.demo4.contract.feign;


import com.example.demo.base.demo4.contract.service.TestService4;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 11:46
 **/
@FeignClient(name = "${demo4.service.serviceName}")
public interface TestService4Impl extends TestService4 {
}
