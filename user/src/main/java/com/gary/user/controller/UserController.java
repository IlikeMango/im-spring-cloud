package com.gary.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "mi-spring-cloud";
    }
}
