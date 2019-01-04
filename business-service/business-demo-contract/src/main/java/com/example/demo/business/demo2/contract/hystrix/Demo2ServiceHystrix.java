package com.example.demo.business.demo2.contract.hystrix;

import com.example.demo.business.demo2.contract.feign.Demo2ServiceImpl;
import com.example.demo.business.demo2.contract.model.Demo2Model;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: servicedemo
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-12-27 23:25
 **/
@Component
public class Demo2ServiceHystrix implements Demo2ServiceImpl {

    @Override
    public String validate(@RequestBody Demo2Model model) {
        return "出现错误";
    }
}
