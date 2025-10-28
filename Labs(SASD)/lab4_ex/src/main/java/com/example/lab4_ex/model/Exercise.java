package com.example.lab4_ex.model;


public class Exercise {

    private Long id;

    private int minutes;

    private String activity;

    private Goal goal;

    public String getActivity() {
        return activity;
    }

    public Long getId() {
        return id;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

}
