package com.example.lab4_ex.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;

@Controller
public class ExerciseController {

    @InitBinder("exercise")
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new ExerciseValidator());
    }

    // --- ✅ Show the exercise form ---
    @GetMapping("/exercise")
    public String exercise(Model model) {
        model.addAttribute("exercise", new Exercise());
        return "fitness/exerform";
    }

    // --- ✅ Handle form submission ---
    @RequestMapping("/addExercise")
    public String addMinutes(@Valid
            @ModelAttribute("exercise") Exercise exercise,
            BindingResult result,
            @RequestParam Long goalId,
            Model model) {

        // 🔍 Trigger validation manually
        if (result.hasErrors()) {
            // if there are validation errors, return to form
            return "fitness/exerform";
        }

        // ✅ Only proceed if valid
        Goal goal = null;
        for (Goal g : Lab4ExApplication.goalList) {
            if (g.getId() == goalId) {
                goal = g;
                break;
            }
        }

        if (goal != null) {
            goal.getExercises().add(exercise);
            exercise.setGoal(goal);
        }

        model.addAttribute("goal", goal);
        return "fitness/showExercise";
    }
}
