package com.examples.exercises.section_9.abstraction_demo;

import java.util.ArrayList;
import java.util.List;

public class Villian implements ISave {

    private String name;
    private int hitPoints;
    private int strength;

    public Villian(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedItems) {
        if(savedItems != null && savedItems.size() > 0) {
            this.name = savedItems.get(0);
            this.hitPoints = Integer.parseInt(savedItems.get(1));
            this.strength = Integer.parseInt(savedItems.get(2));
        }
    }
}
