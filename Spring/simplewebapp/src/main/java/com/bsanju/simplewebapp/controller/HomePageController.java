package com.bsanju.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @RequestMapping("/")
    public  String greeting()
    {
        return "Hello Sanju";
    }

    @RequestMapping("/about")
    public  String about()
    {
        return "This is About Sanju";
    }

}
