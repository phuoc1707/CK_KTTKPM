package com.example.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class RestemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate= new RestTemplate();
        DefaultUriBuilderFactory builderFactory= new DefaultUriBuilderFactory("http://localhost:8080/department");
        restTemplate.setUriTemplateHandler(builderFactory);
        return restTemplate;
    }
}
