package com.trainingspringboot.pratik;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellopratik {
    @RequestMapping(method = RequestMethod.GET,path = "/hello-pratik")
    public String sayHello(){
        return "Hello Pratik!";
    }
}
//this wii print "Hello Pratik!" to the local host