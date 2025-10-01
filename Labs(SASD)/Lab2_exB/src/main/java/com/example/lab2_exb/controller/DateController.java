package com.example.lab2_exb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;  // Import the LocalDateTime class



@Controller
public class DateController {

    @RequestMapping("/whatdate")
    public String date(Model model) {
        model.addAttribute("date",  LocalDateTime.now());
        return "showdate";
    }
}
