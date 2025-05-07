package com.example.searchService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SearchServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SearchServiceApplication.class, args);
    }

//do microservices se communicate by resttemplate
@Bean
public RestTemplate getInstance() {
    return new RestTemplate();
}

}
