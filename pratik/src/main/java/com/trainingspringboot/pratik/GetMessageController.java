package com.trainingspringboot.pratik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping
public class GetMessageController {
    @GetMapping(path="/message")      //--> so this is the another method to create the endpoint
    public String getMessage(){
        return "Message is printed !";
    }

    //so here we have created a REST api which returns string as a output
    //but generally all REST APIs return the output in the JSON format

    @GetMapping(path="/message-bean")      //--> so this is the another method to create the endpoint
    public getMessageBean getMessageBean(){
        return new getMessageBean ("Message is printed !") ;
    }

}
 //this endpoint returns bean (object) as a json response to the local server
/*
{
  "message" : "Message is printed !"
}

*/