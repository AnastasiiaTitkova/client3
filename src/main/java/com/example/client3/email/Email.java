package com.example.client3.email;


import org.springframework.web.bind.annotation.*;

@RestController
public class Email {
    @RequestMapping(value="/email", method= RequestMethod.POST)
    public String sendPush(){
        System.out.println("email was sent");
        return "email was sent";
    }
}