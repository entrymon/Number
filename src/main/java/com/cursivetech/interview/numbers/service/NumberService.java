package com.cursivetech.interview.numbers.service;

import org.springframework.stereotype.Component;

@Component
public class NumberService {

    public String processMessage(String message){
        return "This is processed " + message;
    }
    
}
