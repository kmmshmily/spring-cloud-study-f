package com.kmmshmily.feigndemo;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class FeignDemoApplication {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.HEADERS;
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignDemoApplication.class, args);
    }

}
