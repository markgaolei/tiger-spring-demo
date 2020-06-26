package com.tiger.example.spring.v3.simple;

import com.tiger.example.spring.v3.importer.ImportConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Created by Mark
 */
@Configuration
@Import(ImportConfiguration.class) //扫描ImportConfiguration配置类并且加载
public class SpringConfiguration {

    @Bean
    public DemoService03 getDeDemoService03(){
        return new DemoService03();
    }
}
