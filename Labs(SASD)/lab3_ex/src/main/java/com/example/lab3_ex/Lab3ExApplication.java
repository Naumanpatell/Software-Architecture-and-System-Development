package com.example.lab3_ex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lab3_ex.model.Exercise;
import com.example.lab3_ex.model.Goal;

@SpringBootApplication
public class Lab3ExApplication implements CommandLineRunner {

	/**
	 * Local data storage
	 */
	public static List<Goal> goalList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(Lab3ExApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Goal goal = new Goal();
		goal.setId(Long.valueOf(0));
		goal.setMinutes(60);

		List<Exercise> exerciseList = new ArrayList<>();

		Exercise exercise = new Exercise();
		exercise.setId(Long.valueOf(1));
		exercise.setActivity("running");
		exercise.setGoal(goal);
		exercise.setMinutes(30);
		exerciseList.add(exercise);

		exercise = new Exercise();
		exercise.setId(Long.valueOf(2));
		exercise.setActivity("walking");
		exercise.setGoal(goal);
		exercise.setMinutes(30);
		exerciseList.add(exercise);

		goal.setExercises(exerciseList);
		goalList.add(goal);

		// GOAL 2
		goal = new Goal();
		goal.setId(Long.valueOf(3));
		goal.setMinutes(30);

		exerciseList = new ArrayList<>();

		exercise = new Exercise();
		exercise.setId(Long.valueOf(4));
		exercise.setActivity("running");
		exercise.setGoal(goal);
		exercise.setMinutes(30);
		exerciseList.add(exercise);

		goal.setExercises(exerciseList);
		goalList.add(goal);

	}
}