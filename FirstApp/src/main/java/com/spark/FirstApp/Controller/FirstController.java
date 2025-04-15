package com.spark.FirstApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nisha")
public class FirstController {
    @GetMapping("/test")
    public String methd() {
        return "Hi Nisha";
    }
}
