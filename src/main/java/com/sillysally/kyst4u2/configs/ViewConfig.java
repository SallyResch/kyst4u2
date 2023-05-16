package com.sillysally.kyst4u2.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class ViewConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/updateUser").setViewName("update-user");
        registry.addViewController("/addUser").setViewName("add-user");
        //registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    }
}
