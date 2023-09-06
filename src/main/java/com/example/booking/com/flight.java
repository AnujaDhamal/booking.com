package com.example.booking.com;


import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return "Please book flight on ticket.com with 40% discount";}
}
