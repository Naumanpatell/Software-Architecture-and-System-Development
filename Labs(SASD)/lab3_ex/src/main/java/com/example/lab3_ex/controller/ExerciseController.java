package com.example.lab3_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab3_ex.Lab3ExApplication;
import com.example.lab3_ex.model.Exercise;
import com.example.lab3_ex.model.Goal;

@Controller
public class ExerciseController {

    @GetMapping("/addExercise")
    public String addMinutes(@ModelAttribute Exercise exercise, @RequestParam Long goalId) {

        Goal goal = null;

        for (Goal g : Lab3ExApplication.goalList) {
            if (g.getId() == goalId) {
                goal = g;
                break;
            }
        }

        if (goal != null) {
            goal.getExercises().add(exercise);
            exercise.setGoal(goal);
        }

        return "showexercise";
    }

}
