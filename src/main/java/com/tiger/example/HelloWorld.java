package com.tiger.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Created by Mark
 * @description 测试spring工程构建是否成功
 */
@RestController
@RequestMapping
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Tiger";
    }
}
