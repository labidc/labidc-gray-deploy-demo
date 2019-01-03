package com.example.demo.business.demo2.contract.feign;

import com.example.demo.business.demo2.contract.hystrix.Demo2ServiceHystrix;
import com.example.demo.business.demo2.contract.service.Demo2Service;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 14:53
 **/
@FeignClient(name = "${demo2.service.serviceName}", fallback = Demo2ServiceHystrix.class )
public interface Demo2ServiceImpl extends Demo2Service {
}
