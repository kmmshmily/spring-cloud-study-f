package com.kmmshmily.consulconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: spring-cloud-study-f
 * @description: 服务
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-12 12:54
 **/
@FeignClient("consul-provider")
public interface HelloService {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}   
