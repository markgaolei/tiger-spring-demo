package com.tiger.example.spring.v4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Created by Mark
 */
public class ConditionMain {
    public static void main(String[] args) {
        //初始化注解配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(context.getBean(DemoService.class));
    }
}
