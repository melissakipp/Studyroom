package com.examples.exercises.section_6.swimming_company;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        if(height < 0) {
            this.height = 0;
        }
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}
