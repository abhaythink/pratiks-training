package com.trainingspringboot.pratik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathParameterController {
    @GetMapping("/greet-user/{name}")
    public String greetuser(@PathVariable String name){
        return "Welcome " + name;
    }
}


// t