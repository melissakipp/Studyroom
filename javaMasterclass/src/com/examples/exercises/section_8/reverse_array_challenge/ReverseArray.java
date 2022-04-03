package com.examples.exercises.section_8.reverse_array_challenge;

/* *
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

Tip:
-Create a new console project with the name ReverseArrayChallenge
* */

import java.util.Arrays;

import static com.examples.exercises.section_8.reverse_array_challenge.ReverseArray.reverse;

public class ReverseArray {
    // Method - this method is allowed to modify the array parameter
    /* Instructor access modifier was set to 'private', IntelliJ warning - wanted to change
    * the package to private-package or another option was to change the method to 'protected */
    protected static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

class ReverseArrayTestDrive {
    public static void main(String[] args) {
        int [] arr = {1,5,3,7,11,9,15};
        // Unmodified array
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("===========");
        // Modified array
        reverse(arr);
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
