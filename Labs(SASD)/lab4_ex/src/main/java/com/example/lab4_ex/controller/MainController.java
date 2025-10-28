package com.example.lab4_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /**
     * simply shows the index view
     *
     * @return
     */
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
