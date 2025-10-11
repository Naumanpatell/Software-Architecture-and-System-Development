package com.example.lab2_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class MainController {
    @RequestMapping("/greeting")
    public String exA(Model model) {
        model.addAttribute("value", "Hello World!");
        return "show";
    }

    @RequestMapping("/greeting/{greeting}/{name}")
    public String exB( @PathVariable String greeting, @PathVariable String name, Model model) {
        model.addAttribute("value", greeting + " " + name);
        return "show";
    }

    @RequestMapping("/hello")
    public String exC(@RequestParam(name = "name", defaultValue = "World!") String name, Model model) {
        model.addAttribute("value", "Hello" + " " + name);
        return "show";
    }

    @RequestMapping("/greeting/{number}")
    public String exD(@PathVariable int number, Model model) {
        String message = "Hello";
        for (int i = 0; i < number-1; i++) {
            message += " " + "Hello";}
        model.addAttribute("value", message);
        return "show";
    }
    @RequestMapping("/sum")
    public String exE(@RequestParam Collection <Integer> values , Model model) {
        int sum = 0;
        for(int value : values) {
            sum += value;
        }
        model.addAttribute("value", sum);
        return "show";

    }
}

