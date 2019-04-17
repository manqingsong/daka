package com.spring.data.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2019/04/10
 * Time: 下午19:34
 *
 * @author manqs
 */
@RestController
public class SeeController {

    public static void main(String[] args){
        String str = "100";
        Long l1 = 100L;
        List<Long> list = new ArrayList<>();
        list.add(100L);
        System.out.println(list.contains(str));
        System.out.println(list.contains(l1));
        System.out.println(list.contains(new Object()));
    }
}