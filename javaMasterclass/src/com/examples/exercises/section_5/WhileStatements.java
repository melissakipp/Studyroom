package com.examples.exercises.section_5;

import static com.examples.exercises.section_5.WhileStatements.evenSum;
import static com.examples.exercises.section_5.WhileStatements.isEvenNumber;

public class WhileStatements {

    public static void first(int count) {

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("===========");

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

    }
    /* Challenge
    * Create a method called isEvenNumber that takes a parameter of type int
    * Its purpose is to determine if the argument passed to the method is an
    * even number or not.
    * return true if an even number, otherwise return false;
    * */

    public static void isEvenNumber(int number, int end) {

        if(number <= end) {
            if (number % 2 == 0) {
                //prints the even numbers
                System.out.print(number + " ");
                //calling the method and increments the number by 2 if the number is even
                isEvenNumber(number + 2, end);
            } else {
                //increments the number by 1 if the number is odd
                isEvenNumber(number + 1, end);
            }

        }
    }

    /*
    * Modify the while code above
    * Make it also record the total number of even numbers it has found
    * and break once 5 are found
    * and at the end, display the total number of even numbers found
    * */

    public static boolean evenSum() {

        // Could not figure out
        // The instructor's original version of the above did not work (IntelliJ)
        return false;

    }

}

class WhileStatementsTestDriver {

    public static void main(String[] args) {

        // first(1);
        isEvenNumber(1, 12);
        System.out.println(evenSum());

    }

}