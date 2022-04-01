package com.examples.exercises.section_6.inheritance;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called.");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

class AnimalTestDrive {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);
        System.out.println("This is my first superclass object: " + animal.getName());

        System.out.println("========");

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
        System.out.println(dog.getName());
        dog.eat();

        System.out.println("========");

        dog.walk();
        dog.run();

    }
}
