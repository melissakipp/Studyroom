package com.examples.exercises.section_8;

/*
* Create a program using arrays that sort a list of integers in descending order.
* Descending order is the highest value to lowest.
* In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
* ultimately have an array with 106,81,26, 15, 5 in it.
*
* Set up the program so that the numbers to sort are read in from the keyboard.
* Implement the following methods - getIntegers, printArray, and sortIntegers
* getIntegers returns an array of entered integers from keyboard
* printArray prints out the contents of the array
* and sortIntegers should sort the array and return a new array containing the sorted numbers
* you will have to figure out how to copy the array elements from the passed array into a new
* array and sort them and return the new sorted array.
* */

import java.util.Scanner;
import java.util.Arrays;

import static com.examples.exercises.section_8.ArrayChallenge.*;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    // Method - get user input to form an array
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " content values.\r");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // Return the users input for the next method
        return array;
    }
    // Method - to print the sorted array out in the console
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + "(Input) " + array[i]);
        }
    }
    // Method - organize the user's array (desc)
    public static int[] sortIntegers(int[] array) {
        // Built-in Java Array class (this replaces the code above)
        int[] sortedArray = Arrays.copyOf(array, array.length);
        // Sort through the copied array
        boolean flag = true;
        int temp;
        while(flag) {
            // Setting the while loop false so that code enters into the if statement
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

class ArrayChallengeTestDrive {
    public static void main(String[] args) {
        // Declare and set size for expected number of integers
        int[] myIntegers = getIntegers(5);

        System.out.println("===========");

        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
}
