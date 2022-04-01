package com.examples.exercises.section_5;

import static com.examples.exercises.section_5.SumThreeAndFive.listOfSums;

public class SumThreeAndFive {

    public static void listOfSums(int num1, int num2, int numListed) {

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++) {
            if ((i % num1 == 0) && (i % num2 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == numListed) {
                break;
            }
        }

        System.out.println("Sum = " + sum);

    }

}

class SumThreeAndFiveTestDriver {

    public static void main(String[] args) {
        listOfSums(3,5, 5);
        listOfSums(7,13, 5);
    }

}
