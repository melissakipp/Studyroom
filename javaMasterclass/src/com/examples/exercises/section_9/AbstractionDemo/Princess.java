package com.examples.exercises.section_9.AbstractionDemo;

import java.util.ArrayList;
import java.util.List;

public class Princess implements ISave {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Princess(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedItems) {
        if(savedItems != null && savedItems.size() > 0) {
            this.name = savedItems.get(0);
            this.hitPoints = Integer.parseInt(savedItems.get(1));
            this.strength = Integer.parseInt(savedItems.get(2));
            this.weapon = savedItems.get(3);
        }
    }
}
