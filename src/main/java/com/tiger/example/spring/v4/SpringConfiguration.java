package com.tiger.example.spring.v4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Created by Mark
 */
@Configuration
public class SpringConfiguration {

    //条件注解 如果TigerCondition返回true初始化，否则不初始化
    @Conditional(TigerCondition.class)
    @Bean
    public DemoService getDemoService(){
        return new DemoService();
    }
}
