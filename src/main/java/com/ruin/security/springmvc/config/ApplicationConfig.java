package com.ruin.security.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author ruin
 * @date 2019/12/7-11:48
 */
//相当于ApplicationContext.xml
@Configuration
@ComponentScan(basePackages="com.ruin.security.springmvc"
        ,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class ApplicationConfig {
//    配置除了Controller的其它的bean
}
