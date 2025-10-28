package com.example.lab4_ex.controller;

import com.example.lab4_ex.Lab4ExApplication;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab4_ex.model.Pet;

@Controller
public class PetController {

    @RequestMapping("/pet")
    public String addPet(Model model) {
        model.addAttribute("pet", new Pet());
        model.addAttribute("allspecies", Lab4ExApplication.species);
        return "pet/form";
    }

    @RequestMapping("/showPet")
    public String showPet(@Valid @ModelAttribute Pet pet, BindingResult
            result, Model model) {
        if (result.hasErrors()) {
            return "pet/form";
        }
        return "pet/show";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new PetValidator());
    }

}
