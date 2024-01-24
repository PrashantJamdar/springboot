package com.micro.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration getLimitConfiDetails(){

        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
