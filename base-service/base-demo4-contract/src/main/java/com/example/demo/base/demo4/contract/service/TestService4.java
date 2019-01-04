package com.example.demo.base.demo4.contract.service;


import com.example.demo.base.demo4.contract.constant.TestConstant;
import com.example.demo.base.demo4.contract.model.TestDemo4Model;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotNull;

/**
 * @program: service1
 * @description: 测试服务
 * @author: ChenXingLiang
 * @date: 2018-11-05 10:51
 **/
@Api(description = "测试demo4服务")
@RequestMapping(TestConstant.BASE_PATH)
public interface TestService4 {
    /**
     * demo基础层服务
     *
     * @param model
     * @return
     */
    @ApiOperation("测试请求")
    @PostMapping(value = "/create")
    public String createToken(@RequestBody @NotNull TestDemo4Model model);

}
