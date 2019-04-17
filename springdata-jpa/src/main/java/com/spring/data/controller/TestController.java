package com.spring.data.controller;

import com.alibaba.fastjson.JSON;
import com.spring.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST} ,value = "/test.do")
    public String test(){
        return JSON.toJSONString(userService.queryUserById());
    }
}