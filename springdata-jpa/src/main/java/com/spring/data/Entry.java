package com.spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Date: 2019/03/31
 * Time: 下午00:52
 *
 * @author manqs
 */
@MapperScan(basePackages = "com.spring.data.mapper")
@SpringBootApplication(scanBasePackages = "com.spring.data")
public class Entry {

    public static void main(String[] args){
        SpringApplication.run(Entry.class);
    }
}