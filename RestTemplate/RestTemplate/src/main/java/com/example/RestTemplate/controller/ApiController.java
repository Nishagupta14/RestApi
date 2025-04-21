package com.example.RestTemplate.controller;

import com.example.RestTemplate.model.Post;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ApiController {



        @Autowired
        private RestTemplate restTemplate;

        private final String URL = "https://jsonplaceholder.typicode.com/posts/1";

        // GET POJO
        @GetMapping("/getPost")
        public Post getPost() {
           
            return restTemplate.getForObject(URL, Post.class);
        }

        // GET as JSON Object
       // @GetMapping("/getPostJson")
       /* public JSONObject getPostJson() {
            String response = restTemplate.getForObject(URL, String.class);
            return new JSONObject(Integer.parseInt(response));*/
        }
        /*
        @RestController   // 1️⃣ Tells Spring this is a REST Controller (returns data not views)
@RequestMapping("/api")  // 2️⃣ Base path for this controller's endpoints
public class ApiClientController {

    @Autowired   // 3️⃣ Tells Spring to inject the RestTemplate bean automatically here
    private RestTemplate restTemplate;

    private final String URL = "https://jsonplaceholder.typicode.com/posts/1";  // 4️⃣ API URL to call

    @GetMapping("/getPost")   // 5️⃣ Maps this method to GET /api/getPost
    public String getPost() {
        // 6️⃣ Uses RestTemplate to call external API and fetch a String response
        return restTemplate.getForObject(URL, String.class);
    }
}
         */


