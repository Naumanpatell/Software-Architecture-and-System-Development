package com.example.lab4_ex.controller;

import com.example.lab4_ex.Lab4ExApplication;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.example.lab4_ex.model.Pet;

public class PetValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Pet.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Pet pet = (Pet) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your pet needs a name!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "food", "", "What the fuck does that mf eats?");


        boolean validSpecies = false;
        for (String s : Lab4ExApplication.species) {
            if (s.equals(pet.getSpecies())) {
                validSpecies = true;
                break;
            }
        }
        if (!validSpecies) {
            errors.rejectValue("species", "", "Invalid species.");
        }
    }


}
