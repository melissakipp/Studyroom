package com.examples.exercises.section_5;

import static com.examples.exercises.section_5.Prime.*;

public class Prime {

    /*
    Create a for statement using any range of numbers
    Determine if the number is a prime number using the isPrime method
    if it is a prime number, print it out AND increment a count of the
    number of prime numbers found.
    If that count is 3 exit the for loop
    Hint: use the break; statement to exit
    * */

    static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void listGenerator() {

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrimePlus(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrimePlus(int n) {

        if (n == 1) {
            return false;
        }
        // Less times through the loop
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;


    }

}

class PrimeTestDriver {

    public static void main(String[] args) {

        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
        System.out.println(isPrime(69));

        System.out.println("Faster: " + isPrimePlus(7));

        listGenerator();

    }

}
