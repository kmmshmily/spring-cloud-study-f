package com.kmmshmily.consulprovider.dto;

/**
 * @program: spring-cloud-study-f
 * @description: 测试信息
 * @author: kmmshmily--cuiyong
 * @date: 2020-06-18 22:20
 **/

public class UserInfoDto {
    private String id;
    private String name;
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
