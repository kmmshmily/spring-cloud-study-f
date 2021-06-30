package com.kmmshmily.consulprovider.controller;

import com.kmmshmily.consulprovider.dto.UserInfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-cloud-study-f
 * @description: 测试controller
 * @author: kmmshmily--cuiyong
 * @date: 2020-06-18 22:18
 **/
@RestController
@RequestMapping("/cuiyong")
public class KmmshmilyController {

    @GetMapping("/getForm")
    public String sayHello(@RequestParam("name") String name) {
        return "hello, " + name;
    }

    @PostMapping("/postFormBody")
    public String postFormBody(@RequestBody UserInfoDto dto) {
        return "hello, " + dto.getName() + dto.getAge();
    }

    @PostMapping("/postFormParm")
    public String postFormParm(@RequestParam("name") String name, @RequestParam(name="age", required = false) String age) {
        return "hello, " + name + age;
    }

}   
