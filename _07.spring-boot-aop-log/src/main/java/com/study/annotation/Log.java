package com.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 多参数
//@Target(value = {ElementType.METHOD,ElementType.TYPE})
// 单参数
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)//注解的生存周期，即会保留到哪个阶段
public @interface Log {
    String value() default "";
}
