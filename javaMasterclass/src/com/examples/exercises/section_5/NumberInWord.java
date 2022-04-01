package com.examples.exercises.section_5;

/*
Write a method called printNumberInWord. The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
or other for any other number including negative numbers. You can use if-else statement or switch statement whatever
is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
NOTE: Do not add main method to solution code.
* */

import static com.examples.exercises.section_5.NumberInWord.printNumberInWord;

public class NumberInWord {

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Out of range");
                break;
        }

    }

}

class NumberInWordTestDrive {
    public static void main(String[] args) {

        printNumberInWord(0);
        printNumberInWord(3);
        printNumberInWord(6);
        printNumberInWord(12);
        printNumberInWord(-1);

    }
}
