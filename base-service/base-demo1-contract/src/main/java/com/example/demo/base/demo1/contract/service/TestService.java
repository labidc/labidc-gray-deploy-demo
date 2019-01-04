package com.example.demo.base.demo1.contract.service;

import com.example.demo.base.demo1.contract.constant.TestConstant;
import com.example.demo.base.demo1.contract.model.TestDemoModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: service1
 * @description: 测试服务
 * @author: ChenXingLiang
 * @date: 2018-11-05 10:51
 **/
@Api(description = "测试demo服务")
@RequestMapping(TestConstant.BASE_PATH)
public interface TestService {
    /**
     * demo基础层服务
     *
     * @param model
     * @return
     */
    @ApiOperation("创建token")
    @PostMapping(value = "/create")
    String createToken(@RequestBody TestDemoModel model);

}
