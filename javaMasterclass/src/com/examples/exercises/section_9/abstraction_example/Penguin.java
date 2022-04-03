package com.examples.exercises.section_9.abstraction_example;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at flying, I can swim though.");
    }
}
