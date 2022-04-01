package com.examples.exercises.section_5;

/*
Write a method named getGreatestCommonDivisor with two parameters of
type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate
an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully
divide each of the integers (i.e. without leaving a remainder).

For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
and there is no resulting remainder.

EXAMPLE INPUT/OUTPUT:
* getGreatestCommonDivisor(25, 15); should return 5 since both can
be divided by 5 without a remainder
* getGreatestCommonDivisor(12, 30); should return 6 since both can
be divided by 6 without a remainder
* getGreatestCommonDivisor(9, 18); should return -1 since the first
parameter is < 10
* getGreatestCommonDivisor(81, 153); should return 9 since both can
be divided by 9 without a remainder

HINT: Use a while or a for loop and check if both numbers can be divided
without a remainder.
HINT: Find the minimum of the two numbers.
NOTE: The method getGreatestCommonDivisor should be defined as public
static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.

GCD Logic :-
 30 - 12 = 18
 18 - 12 = 6
 12 - 6 = 6
 6 == 6 -> Greatest Common Divisor
* */

import static com.examples.exercises.section_5.GreatestCommonDivisor.getGreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10) {
            return -1;
        }

        while (first != second) {
            if(first > second) {
                first = first - second;
            }else {
                second = second - first;
            }
        }
        return first;
    }

}

/*
the challenge explanation, the while loop will handle it like this:
Step 1: After the first iteration the numbers now become 81 and 72 (153 - 81)
Step 2: After the next the numbers become 9 and 72 (81 -72)
Step 3: 9 and 63 (72 - 9)
Step 4: 9 and 54 (63 - 9)
Step 5: 9 and 45 (54 - 9)
Step 6: 9 and 36 (45 - 9)
Step 7: 9 and 27 (36 - 9)
Step 8: 9 and 18 (27 - 9)
Step 9: 9 and 9 (18 - 9)
Step 10: 9 and 0 (9 - 9)
The condition in the while loop is no longer true since the second number reached 0 and the
greatest common divisor (9) is returned.
* */

class GreatestCommonDivisorTestDrive {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

}