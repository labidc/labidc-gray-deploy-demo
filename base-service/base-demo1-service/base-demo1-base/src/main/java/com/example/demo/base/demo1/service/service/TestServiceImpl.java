package com.example.demo.base.demo1.service.service;

import com.example.demo.base.demo1.contract.model.TestDemoModel;
import com.example.demo.base.demo1.contract.service.TestService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 14:15
 **/
@RestController
@Log
public class TestServiceImpl implements TestService {

    @Value("${gray.title}")
    private String grayTitle;

    @Override
    public String createToken(@RequestBody TestDemoModel model) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String xxx = request.getHeader("xxx");
        if(!StringUtils.isEmpty(xxx)){
            System.out.println("获取到header xxx:"+xxx);
        }
        return model.getTestText() + " 》》" + grayTitle;
    }
}
