package com.examples.exercises.section_6.inheritance;

public class Dog extends Animal {
    // We can now add unique fields to this Dog class.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // When extending from another class you need to put a default constructor that calls the Superclass constructor.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        /* 'super' is saying call constructor from the class that we're extending from.
        * From the Animal class we know all dogs have one brain and one body,
        * so we set this below and remove from the parameters.
        */
        super(name, 1, 1, size, weight);
        // Initialize the Dog fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() override called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
