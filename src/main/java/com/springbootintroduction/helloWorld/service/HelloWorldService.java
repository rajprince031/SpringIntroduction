package com.springbootintroduction.helloWorld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    public static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);
    public boolean checkLogger(){
        logger.info("------------- iiiii ------------------");
        return true;
    }
}
