package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/web")
public class WebController {
    @RequestMapping("/demo")
    public String demo() {
        return new Random().nextInt(100) + "";
    }
}
