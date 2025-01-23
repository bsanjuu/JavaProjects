package com.bsanju.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRequestController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

}
