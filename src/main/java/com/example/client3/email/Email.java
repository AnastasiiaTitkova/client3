package com.example.client3.email;


import org.springframework.web.bind.annotation.*;

@RestController
public class Email {
    @PostMapping("/email")
    public String sendPush(){
        System.out.println("email was sent");
        return "email was sent";
    }
}