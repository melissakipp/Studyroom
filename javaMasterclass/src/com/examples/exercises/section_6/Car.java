package com.examples.exercises.section_6;

/*
Class Intro
*/
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}

class CarTestDrive {
    public static void main(String[] args) {

        // Initialized a new objects with the class/template
        Car porsche = new Car();
        Car holden = new Car();

        // Accessing the data
        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());

    }
}
