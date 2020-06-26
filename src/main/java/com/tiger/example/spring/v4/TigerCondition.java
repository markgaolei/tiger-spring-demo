package com.tiger.example.spring.v4;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: Created by Mark
 */
public class TigerCondition implements Condition {
    
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // TODO 这里可以实现很多业务逻辑处理
        //返回false时 bean不实例化
//        return false;
        //返回true时 bean实例化
        return true;
    }
}
