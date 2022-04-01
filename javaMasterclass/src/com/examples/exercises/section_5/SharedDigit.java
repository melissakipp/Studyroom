package com.examples.exercises.section_5;

/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit should be defined as public static like we have been doing
so far in the course.
NOTE: Do not add a main method to the solution code.
* */

import static com.examples.exercises.section_5.SharedDigit.hasSharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if(!((a >= 10 && a <= 99) && (b >= 10 && b <= 99)))
            return false;

        int num1A = a / 10;
        int num1B = a % 10;
        int num2A = b / 10;
        int num2B = b % 10;

        return (num1A == num2A || num1A == num2B) || (num1B == num2A || num1B == num2B);

    }

    public static boolean firstVersion(int targetNumber, int userGuess) {

        String a = Integer.toString(targetNumber),
                b = Integer.toString(userGuess);

        if((targetNumber >= 10 && targetNumber <= 99) && (userGuess >= 10 && userGuess <= 99)) {
            for(int i = 1; i < 4; i++) {
                if(a.charAt(i) == b.charAt(i)) {
                    return true;
                } else return false;
            }
        } else return false;

        return false;
    }

}

class SharedDigitTestDrive {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

}