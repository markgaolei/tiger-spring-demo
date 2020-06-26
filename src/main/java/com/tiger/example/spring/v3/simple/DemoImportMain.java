package com.tiger.example.spring.v3.simple;

import com.tiger.example.spring.v3.importer.ImportConfiguration;
import com.tiger.example.spring.v3.importer.ImportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Created by Mark
 */
public class DemoImportMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(context.getBean(ImportService.class));
    }
}
