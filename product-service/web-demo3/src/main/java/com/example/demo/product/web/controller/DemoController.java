package com.example.demo.product.web.controller;

import com.example.demo.business.demo2.contract.feign.Demo2ServiceImpl;
import com.example.demo.business.demo2.contract.model.Demo2Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 17:41
 * http://127.0.0.1:10003/woaini/test
 **/
@RestController
@RequestMapping(value = "/woaini")
public class DemoController {


    /**
     * demo2服务
     */
    @Autowired
    private Demo2ServiceImpl demo2Service;

    @Value("${gray.title}")
    private String grayTitle;


    /**
     * 测试请求
     *
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_UTF8_VALUE,
            "text/html;charset=UTF-8"
    })
    @ResponseBody
    public String test() {
        Demo2Model demo2Model = new Demo2Model();
        demo2Model.setDemo2Name(grayTitle);
        return demo2Service.validate(demo2Model);
    }
}
