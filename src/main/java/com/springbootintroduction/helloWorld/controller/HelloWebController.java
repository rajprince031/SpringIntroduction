package com.springbootintroduction.helloWorld.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWebController {

    public static final Logger logger = LoggerFactory.getLogger(HelloWebController.class);
    @GetMapping("/web")
    public String hello(Model model){
        logger.info("I am web Page");
        model.addAttribute("message" , "Hello from BridgeLabz");
        return "hello";

    }
}
