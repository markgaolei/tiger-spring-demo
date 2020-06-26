package com.tiger.example.spring.v3.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Created by Mark
 */
public class Demo03Main {
    public static void main(String[] args) {
        //Spring3.x通过@Configuration完全代替了application-context.xml文件达到去xml化的目的
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(context.getBean(DemoService03.class));
    }
}
