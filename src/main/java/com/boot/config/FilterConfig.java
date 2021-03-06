package com.boot.config;

import com.boot.filter.CostFilter;
import com.boot.filter.RegisterFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registerCostFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CostFilter());
        registration.addUrlPatterns("/api/*");
        registration.setName("costFilter");
        registration.addInitParameter("nowDate",String.valueOf(new Date()));
        registration.setOrder(2);
        return registration;
    }

    @Bean
    public FilterRegistrationBean registerRegisterFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new RegisterFilter());
        registration.addUrlPatterns("/api/*");
        registration.setName("registerFilter");
        registration.setOrder(1);
        return registration;
    }
}
