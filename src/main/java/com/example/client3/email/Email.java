package com.example.client3.email;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Email {
    @GetMapping("/email")
    public String sendPush(){
        System.out.println("email was sent");
        return "email was sent";
    }
}