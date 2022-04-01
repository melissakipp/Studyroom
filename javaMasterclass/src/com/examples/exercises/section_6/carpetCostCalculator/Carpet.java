package com.examples.exercises.section_6.carpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 :cost;
    }

    public double getCost() {
        return this.cost;
    }
}

