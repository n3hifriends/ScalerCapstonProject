package com.scaler.dockerdemo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HelloDocker {

    @GetMapping("/{name}")
    public String print(@PathVariable String name){
        return "Hello " + name;
    }
}
