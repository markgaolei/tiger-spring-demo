package com.tiger.example.spring.v3.enable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: Created by Mark
 */
@Configuration
@EnableScheduling
public class ScheduleConfiguration {

    @Bean
    public ScheduleService getScheduleService(){
        return new ScheduleService();
    }
}
