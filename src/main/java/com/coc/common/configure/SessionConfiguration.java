package com.coc.common.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Name:SessionConfiguration
 * Description:将SessionInterceptor拦截器添加到SpringBoot的配置中，让SpringBoot项目有这么一个拦截器存在
 * Author:yangxiaocui
 * Time: 2018/6/4 15:29
 */
@Configuration
public class SessionConfiguration extends WebMvcConfigurationSupport{
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }
}
