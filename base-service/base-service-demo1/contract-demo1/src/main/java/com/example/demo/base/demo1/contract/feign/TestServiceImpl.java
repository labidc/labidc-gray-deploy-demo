package com.example.demo.base.demo1.contract.feign;

import com.example.demo.base.demo1.contract.model.TestDemoModel;
import com.example.demo.base.demo1.contract.service.TestService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 11:46
 **/
@FeignClient(name = "${demo1.service.serviceName}")
public interface TestServiceImpl extends TestService {
}
