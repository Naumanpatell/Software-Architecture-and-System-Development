package com.example.lab2_ex.model;
public class Pet {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    private String species;
    public String toString() {
        return "Pet " + name + " is a " + species;
    }
}