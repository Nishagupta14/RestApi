package com.example.RestaurantService.service;

import com.example.RestaurantService.dto.Restaurant;
import com.example.RestaurantService.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{


    @Autowired

    RestTemplate restTemplate;

    @Override
     public List<Restaurant> getAllRest(){
         Restaurant[] restaurants =restTemplate.getForObject("http://localhost:9000/restaurant/getALL",Restaurant[].class);
         //list to array
        return Arrays.asList(restaurants);


     }
}
