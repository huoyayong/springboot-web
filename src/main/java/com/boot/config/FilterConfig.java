package com.boot.config;

import com.boot.filter.CostFilter;
import com.boot.filter.RegisterFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CostFilter> registerCostFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CostFilter());
        registration.addUrlPatterns("/api/*");
//        registration.setOrder(FilterRegistrationBean.LOWEST_PRECEDENCE -1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean<RegisterFilter> registerRegisterFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new RegisterFilter());
        registration.addUrlPatterns("/api/*");
//        registration.setOrder(FilterRegistrationBean.LOWEST_PRECEDENCE);
        return registration;
    }
}
