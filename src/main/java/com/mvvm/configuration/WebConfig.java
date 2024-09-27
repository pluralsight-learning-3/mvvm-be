package com.mvvm.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://thankful-pebble-0f484ff03.5.azurestaticapps.net/", "http://localhost:4200")
                .allowedHeaders("*")
                .allowedMethods("GET", "POST");
    }
}
