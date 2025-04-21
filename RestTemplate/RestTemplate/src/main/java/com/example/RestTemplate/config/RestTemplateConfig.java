package com.example.RestTemplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {


        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
        /*
        @Configuration   // 1️⃣ Marks this class as configuration to Spring
public class RestTemplateConfig {
    @Bean       // 2️⃣ Declares a singleton RestTemplate bean managed by Spring's container
    public RestTemplate restTemplate() {
        return new RestTemplate();  // 3️⃣ Creates a RestTemplate instance to handle HTTP requests
    }
}
         */
}
