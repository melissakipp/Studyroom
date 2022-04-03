package com.examples.exercises.section_8.min_element_challenge;

/* *
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name MinElementChallenge
* */

import java.util.Scanner;

import static com.examples.exercises.section_8.min_element_challenge.MinimumElement.*;


public class MinimumElement {

    // private (so other methods can not access) static (to insure there is not another instance of the scanner)
    private static Scanner scanner = new Scanner(System.in);

    // Prompt the user for a list of numbers
    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        // Return the users input for the next method
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

}

class MinimumElementTestDrive {
    public static void main(String[] args) {
        // IntelliJ had errors for the 'scanner' until I add this.
        Scanner scanner = new Scanner(System.in);
        // Prompt user for the number of integers they want in the array
        System.out.println("Enter the amount of Integers: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min = " +  returnedMin);

    }
}
