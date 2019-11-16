package com.imatao.http.web.JieKou;


import java.lang.annotation.*;

/**
 * 这个接口主要是用于给别人用的，作为一个注解的接口，aop编程，
 */

@Target(ElementType.METHOD) //该注解的作用范围

@Retention(RetentionPolicy.RUNTIME)//描述注解的生命周期，

@Documented
public @interface HttpAsceptTest {

}
