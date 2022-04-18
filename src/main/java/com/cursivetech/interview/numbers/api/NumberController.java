package com.cursivetech.interview.numbers.api;

import com.cursivetech.interview.numbers.service.NumberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class NumberController {

    @Autowired
    NumberService numberService;

    @RequestMapping(value = "/message/{message}")
    public String getMessage(@PathVariable("message") String message) {
        return this.numberService.processMessage(message);
    }
    
}
