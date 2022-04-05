package com.examples.exercises.section_11.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println("Method instance variable - " + i * privateVar);
            System.out.println("Class instance variable - " + i * this.privateVar);
            System.out.println("========================");
        }
    }
}

class ScopeCheckTestDrive {
    public static void main(String[] args) {
        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        System.out.println("++++++++++++++++++++++");
        scopeInstance.timesTwo();
    }
}
