package com.example.demo.business.demo2.contract;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @program: service1
 * @description: TODO
 * @author: ChenXingLiang
 * @date: 2018-11-05 15:24
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({Demo2AutoConfiguration.class})
public @interface EnableDemo2Util {
}
