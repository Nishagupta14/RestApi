package com.covid.app.CovidApp.controller;

import com.covid.app.CovidApp.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid-data")
public class CovidController {
    @Autowired
    CovidDataService covidDataService;
    //localhost:8080/citywise/delhi(this delhi will be picked by framework and put in this{city }dynamic variavle}
    @GetMapping("/citywise/{city}")
    public  Integer getCovidCases(@PathVariable String city){
       Integer res=covidDataService.getCovidData(city);
        return 0;

    }
}
