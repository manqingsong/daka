package com.spring.data.controller;


import com.spring.data.utils.AESUtils;
import org.apache.commons.lang3.StringUtils;
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
        if (StringUtils.isNotBlank(str)) {
            return AESUtils.AESEncode(AESUtils.key, str);
        }
        return "加密失败！";
    }
}