package com.tiger.example.spring.v3.enable;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: Created by Mark
 */
public class ScheduleService {

    @Scheduled(fixedRate = 3000)
    public void getCurrentTime(){
        System.out.println("Current Time:" + new Date());
    }
}
