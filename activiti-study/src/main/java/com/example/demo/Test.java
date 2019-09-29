package com.example.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

/**
 * @program: spring-cloud-study-f
 * @description: 测试工作流
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-29 21:37
 **/

public class Test {
    public static void main(String[] args) {
        ProcessEngineConfiguration engineConfiguration=ProcessEngineConfiguration.
                createStandaloneProcessEngineConfiguration();

        //设置数据库连接属性
        engineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        engineConfiguration.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/activiti_kmmshmily_db?characterEncoding=utf8");
        engineConfiguration.setJdbcUsername("root");
        engineConfiguration.setJdbcPassword("123456");


        // 设置创建表的策略 （当没有表时，自动创建表）
        //		  public static final java.lang.String DB_SCHEMA_UPDATE_FALSE = "false";//不会自动创建表，没有表，则抛异常
        //		  public static final java.lang.String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";//先删除，再创建表
        //		  public static final java.lang.String DB_SCHEMA_UPDATE_TRUE = "true";//假如没有表，则自动创建
//        engineConfiguration.setDatabaseSchemaUpdate("true");
        //通过ProcessEngineConfiguration对象创建 ProcessEngine 对象
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        System.out.println("流程引擎创建成功!");


    }
}   
