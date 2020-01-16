package com.kmmshmily.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-study-f
 * @description: kmmshmilybean
 * @author: kmmshmily--cuiyong
 * @date: 2020-01-15 16:38
 **/
@Configuration
public class KmmshmilyBean {
    private String testStr = "kmmshmily";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    @Bean(name = "kmmshmilyBean")
    public KmmshmilyBean test(){
        return new KmmshmilyBean();
    }
}   
