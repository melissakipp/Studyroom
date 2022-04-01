package com.examples.exercises.section_5;

import static com.examples.exercises.section_5.DigitSum.sumDigits;

public class DigitSum {

    static int sumDigits(int number) {

        if(number < 10) {
                return -1;

        }

        int sum = 0;
        while (number > 0) {
            // Extract the lest-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10; // same as number = number / 10;
        }

        return sum;

    }

}

class DigitSumTestDriver {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
    }

}