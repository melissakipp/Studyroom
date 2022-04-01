package com.examples.exercises.section_4;

import static com.examples.exercises.section_4.PositiveNegativeZero.checkNumber;

public class PositiveNegativeZero {

    public static void checkNumber(int number) {

        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

}

class PositiveNegativeZeroTestDrive {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-2);
        checkNumber(0);
    }

}