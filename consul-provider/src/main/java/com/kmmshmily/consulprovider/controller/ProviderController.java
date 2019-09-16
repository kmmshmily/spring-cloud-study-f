package com.kmmshmily.consulprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-study-f
 * @description: 提供者控制层
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-12 12:29
 **/
@RestController
public class ProviderController {

    @GetMapping("/actuator/health")
    public String Health(){
        return "success";
    }

    @GetMapping("/sayHello")
    public String sayHello(String name){
        return "hello, "+ name;
    }

}   
