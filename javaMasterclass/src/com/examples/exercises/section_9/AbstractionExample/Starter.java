package com.examples.exercises.section_9.AbstractionExample;

public class Starter {
    public static void main(String[] args) {
        Dog roxy = new Dog("Roxy");
        roxy.eat();
        roxy.breathe();

        System.out.println("++++++++++++++++");

        Parrot lucky = new Parrot("Lucky");
        lucky.breathe();
        lucky.eat();
        lucky.fly();

        System.out.println("++++++++++++++++");

        Penguin emperor = new Penguin("Emperor");
        emperor.fly();

    }
}
