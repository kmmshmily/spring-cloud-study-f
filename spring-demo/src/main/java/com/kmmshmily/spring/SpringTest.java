package com.kmmshmily.spring;

import com.kmmshmily.bean.MyTestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @program: spring-cloud-study-f
 * @description: 使用XML搞一波
 * @author: kmmshmily--cuiyong
 * @date: 2020-01-14 16:02
 **/

public class SpringTest {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("/xml/beanFactoryXml.xml"));
        MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
        System.out.println(bean.getTestStr());
    }
}   
