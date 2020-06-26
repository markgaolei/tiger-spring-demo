package com.tiger.example.spring.v3.enable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: Created by Mark
 */
public class ScheduledMain {
    public static void main(String[] args) {
        //通过xml方式启动
//        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application-context-sheduler.xml");
        //通过注解的方式启动
        ApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfiguration.class);
    }
}
