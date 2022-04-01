package com.examples.exercises.section_7.polymorphism;

public class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over plant earth.";
    }
}
