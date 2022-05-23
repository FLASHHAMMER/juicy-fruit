package com.comviva.juicyfruit.controller;

import com.comviva.juicyfruit.model.HelloResponse;
import com.comviva.juicyfruit.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class TestHelloController {

    @Autowired
    HelloService helloService;

    @GetMapping
    public HelloResponse hello(){
        return helloService.hello();
    }

}
