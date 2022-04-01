package com.examples.exercises.section_6.round;

public class Cylinder extends Circle {

    private double height;

    //Create Constructor, initialization of fields
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0.0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    //Methods
    public double getHeight() {
        return height;
    }

    //Methods
    public double getVolume() {
        return getHeight() * getArea();
    }

}
