package com.example.lab4_ex.controller;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ExerciseValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Exercise.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Exercise exercise = (Exercise) target;

        // --- 1️⃣ Check that ID is unique across all exercises ---
        for (Goal g : Lab4ExApplication.goalList) {
            for (Exercise e : g.getExercises()) {
                if (e.getId() != null && e.getId().equals(exercise.getId())) {
                    errors.rejectValue("id", "", "Exercise ID must be unique!");
                    break;
                }
            }
        }

        // --- 2️⃣ Check that minutes are between 10 and 180 ---
        if (exercise.getMinutes() < 10 || exercise.getMinutes() > 180) {
            errors.rejectValue("minutes", "", "Minutes must be between 10 and 180.");
        }

        // --- 3️⃣ Optionally check for empty or invalid activity ---
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "activity", "", "Activity cannot be empty!");
    }
}




