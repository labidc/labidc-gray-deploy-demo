package com.example.demo.business.demo2.contract.service;

import com.example.demo.business.demo2.contract.constant.Demo2Constant;
import com.example.demo.business.demo2.contract.model.Demo2Model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotNull;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 14:53
 **/
@Api(description = "测试demo2服务")
@RequestMapping(Demo2Constant.BASE_PATH)
public interface Demo2Service {

    /**
     * 创建一个token关联上指定用户
     *
     * @param model 用户token数据库实体
     * @return 生成的token
     */
    @ApiOperation("判断登录")
    @PostMapping(value = "/validate")
    public String validate(@RequestBody @NotNull Demo2Model model);

}
