package com.examples.exercises.section_11._final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTest static initialization block called.");
    }

    public SIBTest() {
        System.out.println("SIB constructor called.");
    }

    static {
        System.out.println("2nd initialization block called.");
    }

    public void someMethod() {
        System.out.println("someMethod called.");
    }
}

class SIBTestTestDrive {
    public static void main(String[] args) {
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
