package com.internship.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class BeginController {

    @GetMapping("/test")
    public String index(){
        return "USER IS TESTED" ;
    }
}
