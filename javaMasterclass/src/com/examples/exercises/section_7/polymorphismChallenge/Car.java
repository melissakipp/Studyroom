package com.examples.exercises.section_7.polymorphismChallenge;

// Base class

/*
* We are going to go back to the car analogy.
* Create a base class called Car
* It should have a few fields that would be appropriate for a generic car class.
* engine, cylinders, wheels, etc.
* Constructor should initialize cylinders (number of) and name, and set wheels to 4
* and engine to true. Cylinders and names would be passed parameters.
* Create appropriate getters
* Create some methods like startEngine, accelerate, and brake.
* Show a message for each in the base class.
* Now create three subclasses for your favorite vehicles.
* Override the appropriate methods to demonstrate polymorphism in use.
* Put all classes in the one java file(this one).
* */

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    // startEngine, accelerate, and brake
    public String startEngine() {
        return "Check battery";
    }

//    public String accelerate(int speed) {
//        if(speed > 0 && speed < 30) {
//            return "Safe and Slow.";
//        } else if(speed > 30 && speed < 50) {
//            return "You are making good time.";
//        } else {
//            return "The faster, the better, but watch out for police!";
//        }
//    }

    public String accelerate() {
        return "Gas is on the right...";
    }

    public String brake() {
        return "STOPPED!!!";
    }

}

class CarTestDrive {
    public static void main(String[] args) {

        Car car = new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("=========");

        Mitsubishi mitsubishi = new Mitsubishi("Outlander VRW 4WD",6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("=========");

        Ford ford = new Ford("F2500",8);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.getCylinders());
        System.out.println(ford.getName());

        System.out.println("=========");

        Holden holden = new Holden("Holden Commodore",6);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}
