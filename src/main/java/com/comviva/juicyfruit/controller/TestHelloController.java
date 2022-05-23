package com.comviva.juicyfruit.controller;

import com.comviva.juicyfruit.model.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class TestHelloController {

    @GetMapping
    public HelloResponse hello(){
        HelloResponse helloResponse = new HelloResponse();
        Map<String, String> helloMap = new HashMap<>();
        helloMap.put("Hello", "human!");
        helloResponse.setResponse(helloMap);
        return helloResponse;
    }

}
