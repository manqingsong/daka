package com.spring.data.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 加密controller
 */
@RestController
public class AESController {

    @PostMapping(value = {"/encodeAes"})
    public String encodeAes(@RequestBody String str){
        return null;
    }
}