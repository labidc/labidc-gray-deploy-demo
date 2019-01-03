package com.example.demo.base.demo1.service.service;

import com.example.demo.base.demo1.contract.constant.TestConstant;
import com.example.demo.base.demo1.contract.model.TestDemoModel;
import com.example.demo.base.demo1.contract.service.TestService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 14:15
 **/
@RestController
@RequestMapping(TestConstant.BASE_PATH)
@Log
public class TestServiceImpl implements TestService {

    @Value("${gray.title}")
    private String grayTitle;

    @Override
    public String createToken(@RequestBody TestDemoModel model) {
        return model.getTestText() + " 》》" + grayTitle;
    }
}
