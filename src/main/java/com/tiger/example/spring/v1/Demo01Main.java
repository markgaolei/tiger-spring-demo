package com.tiger.example.spring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: Created by Mark
 */
public class Demo01Main {
    public static void main(String[] args) {
        //Spring1.x通过加载文件路径下的xml装载Bean
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application-context-v1.xml");
        System.out.println(context.getBean(DemoService01.class));
    }
}
