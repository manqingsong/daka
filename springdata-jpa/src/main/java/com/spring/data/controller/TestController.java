package com.spring.data.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2019/04/10
 * Time: 下午17:33
 *
 * @author manqs
 */
@RestController
public class TestController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST} ,value = "/test.do")
    public String test(){
        return "测试";
    }
}