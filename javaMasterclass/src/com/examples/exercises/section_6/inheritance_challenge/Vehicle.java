package com.examples.exercises.section_6.inheritance_challenge;

/* Challenge
* Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
* Finally, create another class, a specific type of Car that inherits from the Car class.
* You should be able to hand steering, changing gears, and moving (speed in other words).
* You will want to decide where to put the appropriate state and behaviours (fields and methods).
* As mentioned above, changing gears, increasing/decreasing speed should be included.
* For you specific type of vehicle you will want to add something specific for that ype of car.
* */

public class Vehicle {

    private String name;
    private String vehicleType; // Size

    private int speed; // Velocity
    private int currentDirection;

    public Vehicle(String name, String vehicleType, int speed) {
        this.name = name;
        this.vehicleType = vehicleType;

        this.speed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        speed = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + speed + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop() {
      this.speed = 0;
    }
}

class VehicleTestDrive {

    public static void main(String[] args) {

        Outlander car1 = new Outlander(0, 36);
        car1.steer(45);
        System.out.println("*******");
        car1.accelerate(30);
        System.out.println("*******");
        car1.accelerate(20);
        System.out.println("*******");
        car1.accelerate(-42);

    }

}
