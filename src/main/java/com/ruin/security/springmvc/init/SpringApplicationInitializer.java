package com.ruin.security.springmvc.init;

import com.ruin.security.springmvc.config.ApplicationConfig;
import com.ruin.security.springmvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author ruin
 * @date 2019/12/7-12:00
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    spring容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ApplicationConfig.class};
    }

//    servletContext
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

//    url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
