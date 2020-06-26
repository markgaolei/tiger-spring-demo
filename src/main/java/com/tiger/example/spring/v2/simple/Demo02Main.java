package com.tiger.example.spring.v2.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: Created by Mark
 */
public class Demo02Main {
    public static void main(String[] args) {

        //Spring2.x通过@Repository@Service@Controller@Component减少了在XML中大量声明Bean
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application-context-v2.xml");
        System.out.println(context.getBean(Demo02Service.class));
    }
}
