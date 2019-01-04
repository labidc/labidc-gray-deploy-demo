package com.example.demo.base.demo4.service.service;

import com.example.demo.base.demo4.contract.model.TestDemo4Model;
import com.example.demo.base.demo4.contract.service.TestService4;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: servicedemo
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-12-28 13:56
 **/
@RestController
@Log
public class Test4ServiceImpl implements TestService4 {

    @Value("${gray.title}")
    private String grayTitle;


    @Override
    public String createToken(@RequestBody TestDemo4Model model) {
        return model.getTestText() + " 》》" + grayTitle;
    }
}
