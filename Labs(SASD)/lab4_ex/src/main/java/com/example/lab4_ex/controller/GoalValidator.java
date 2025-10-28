package com.example.lab4_ex.controller;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class GoalValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        // This validator only supports Exercise objects
        return Goal.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Goal goal = (Goal) target;
        for (Goal g : Lab4ExApplication.goalList) {
            if (g.getId() != null && g.getId().equals(goal.getId())) {
                {
                    errors.rejectValue("id", "", "Exercise ID must be unique!");
                    break;
                }
            }
            if (goal.getMinutes() > 0) {
                errors.rejectValue("minutes", "", "Minutes must be positive!.");
            }
        }
    }
}

