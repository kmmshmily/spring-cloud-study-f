package com.kmmshmily.feigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-study-f
 * @description: 控制类
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-19 12:41
 **/
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/search/github")
    public String searchGithub(@RequestParam("id")String queryStr){
        return helloService.searchRepo(queryStr);
    }
}   
