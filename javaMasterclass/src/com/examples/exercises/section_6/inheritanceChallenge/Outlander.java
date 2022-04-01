package com.examples.exercises.section_6.inheritanceChallenge;

public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int speed, int roadServiceMonths) {
        super("Outlander", "4WD", 6, speed, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newSpeed = getSpeed() + rate;
        if(newSpeed == 0) {
            stop();
            changeGear(1);
        } else if(newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if(newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

}
