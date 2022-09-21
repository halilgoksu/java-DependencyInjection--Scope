package com.example.spring.is.here.demo;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
//SINGLETON
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //default

//PROTOTYPE
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

//@RequestScope
//http://localhost:8080/api/first-controller
//http://localhost:8080/api/second-controller

@SessionScope


public class MyComponenet {

    public MyComponenet() {
        System.out.println("MyComponent created at "+ LocalDateTime.now());
    }


    public String getName() {
       return "MyComponent";
    }




}
