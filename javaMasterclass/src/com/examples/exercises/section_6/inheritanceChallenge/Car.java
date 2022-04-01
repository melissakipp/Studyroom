package com.examples.exercises.section_6.inheritanceChallenge;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String vehicleType, int gears, int speed, int wheels, int doors, boolean isManual) {
        super(name, vehicleType, speed);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car,changeSpeed(): Speed " + speed + " direction " + direction);
    }

}
