package com.example.RestaurantService.controller;

import com.example.RestaurantService.dto.Restaurant;
import com.example.RestaurantService.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurant")

public class RestaurantController {

    @Autowired
    SearchService searchService;
    @GetMapping("/restaurant/getALL")
    public List<Restaurant> findALL(){
        return searchService.getAllRest();
    }

}
