package com.example.demo.business.demo2.service.service;



import com.example.demo.base.demo1.contract.feign.TestServiceImpl;
import com.example.demo.base.demo1.contract.model.TestDemoModel;
import com.example.demo.base.demo4.contract.feign.TestService4Impl;
import com.example.demo.base.demo4.contract.model.TestDemo4Model;
import com.example.demo.business.demo2.contract.constant.Demo2Constant;
import com.example.demo.business.demo2.contract.model.Demo2Model;
import com.example.demo.business.demo2.contract.service.Demo2Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 15:03
 **/
@RestController
@RequestMapping(Demo2Constant.BASE_PATH)
@Log
public class Demo2ServiceImpl implements Demo2Service {

    @Autowired
    private TestServiceImpl testService;



    @Autowired
    private TestService4Impl test4Service;

    @Value("${gray.title}")
    private String grayTitle;

    @Override
    public String validate(@RequestBody Demo2Model model) {

        TestDemoModel testDemoModel = new TestDemoModel();
        testDemoModel.setTestText(model.getDemo2Name() + " 》》" + grayTitle);
        testService.createToken(testDemoModel);

        TestDemo4Model testDemo4Model = new TestDemo4Model();
        testDemo4Model.setTestText(model.getDemo2Name() + " 》》" + grayTitle);

        return test4Service.createToken(testDemo4Model);
    }


}
