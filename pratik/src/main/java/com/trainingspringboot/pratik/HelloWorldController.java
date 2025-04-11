package com.trainingspringboot.pratik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}


//This is the same api like stucture to the hello pratik
// but here we are using @GetMapping to the method to denote the endpoint to that class