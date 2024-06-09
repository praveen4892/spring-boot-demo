package com.dev.sunny.springbootdemo.controllers;

import com.dev.sunny.springbootdemo.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

// What is Spring IoC Container and Dependency Injection?
// What is dependency?
@Controller
public class HomeController {

    private final GreetingService greetingService;

    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/hello")
    public String hello(Model model, @RequestParam(name = "greeterName") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping(value = "/json", produces = "application/json")
    @ResponseBody
    public Map<String, String> helloJson(@RequestParam(name = "greeterName") String name) {
        return greetingService.greet(name);
    }

}
