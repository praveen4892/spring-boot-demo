package com.dev.sunny.springbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

// What is the controller and rest controller?
// Controller is a class that handles HTTP requests. These are the components of the Spring MVC framework.
// RestController is a convenience annotation that is itself annotated with Controller and ResponseBody. This annotation is used to create RESTful web services using Spring MVC.
@Controller
public class HomeController {

    @GetMapping(value = "/hello")
    public String hello(Model model, @RequestParam(name = "greeterName") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping(value = "/json", produces = "application/json")
    @ResponseBody
    public Map<String, String> helloJson(@RequestParam(name = "greeterName") String name) {
        return Map.of("name", name);
    }

}
