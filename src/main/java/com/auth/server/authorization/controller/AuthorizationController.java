package com.auth.server.authorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @GetMapping
    public String getGreeting(){
        return  "Hello Guest !!!!";
    }
}
