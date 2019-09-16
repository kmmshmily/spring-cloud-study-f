package com.kmmshmily.consulconsumer.controller;

import com.kmmshmily.consulconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-study-f
 * @description: 消费者控制层
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-12 12:53
 **/
@RestController
public class ConsumerController {

    @Autowired(required = false)
    private HelloService helloService;

    @GetMapping("/actoator/health")
    public String Health(){
        return "success";
    }

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return helloService.sayHello(name);
    }
}   
