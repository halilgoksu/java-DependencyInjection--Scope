package com.example.spring.is.here.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecondController {

    @Autowired
    private MyComponenet myComponenet;

    @GetMapping("/second-controller")
    private String getNameOfComponent(){
        return this.myComponenet.getName();
    }

}
